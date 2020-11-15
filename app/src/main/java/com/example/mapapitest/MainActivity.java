package com.example.mapapitest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mapAPI;
    SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapAPI);
        mapFragment.getMapAsync(this);



    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapAPI = googleMap;
        LatLng Maha = new LatLng(19.139941, 72.837570);
        mapAPI.addMarker(new MarkerOptions().position(Maha).title("Selected Home"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Maha));

    }
}