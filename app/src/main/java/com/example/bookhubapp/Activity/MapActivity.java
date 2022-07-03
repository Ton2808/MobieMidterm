package com.example.bookhubapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bookhubapp.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.myMap);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        ArrayList<LatLng> stores = new ArrayList<LatLng>();
        stores.add(new LatLng(10.7625,106.682));
        stores.add(new LatLng(20.997,105.862 ));

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stores.get(0), 15));

        for (int i = 0; i < stores.size(); i++){
            googleMap.addMarker(new MarkerOptions().title("Cửa hàng" +String.valueOf(i+1)).snippet("Knowledge ís power").position(stores.get(i)));
        }
    }
}
