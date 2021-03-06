package com.ezmoizy.abdulmoiz.mapsdemo;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    // Test update from Android Studio.


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker on McMaster U and move the camera
        LatLng mcmaster = new LatLng(43.261926, -79.919182);

        Marker mcmaster_marker = mMap.addMarker(new MarkerOptions().position(mcmaster).title("McMaster University"));

        // Move the camera instantly to location with a zoom of 17.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mcmaster, 10));

        //made a new marker centered on McMaster
        Marker mcmarker = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(43.261926, -79.919182))
                .title("McMaster University"));


        /*

        Create branch -> make changes -> commit to local -> push to remote

        Open master branch -> VCS -> Git -> Merge changes... -> Select appropriate branch -> merge

         */

        Marker uofmarker = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(43.662653, -79.396356))
                .title("University of Toronto"));

    }
}
