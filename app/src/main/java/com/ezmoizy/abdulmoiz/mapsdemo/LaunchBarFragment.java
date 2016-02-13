package com.ezmoizy.abdulmoiz.mapsdemo;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Moiz on 20/01/2016.
 */
public class LaunchBarFragment extends Fragment {

    ControlButtonListener activityCommander;
    LatLng mcmaster = new LatLng(43.261926, -79.919182);


    public interface ControlButtonListener{
        public void newArea(LatLng area);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.launch_bar_fragment, container, false);

        Button button = (Button) view.findViewById(R.id.gotojhe);

        button.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                nextClass(v);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (ControlButtonListener) context;
        } catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    public void nextClass(View v){

        //activityCommander.newArea();


    }

}
