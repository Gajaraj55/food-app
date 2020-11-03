package com.example.food;


import android.content.Intent;
import android.location.Location;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_setting extends Fragment {


    public Fragment_setting() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_setting, container, false);

        CircleImageView circleImageView = (CircleImageView) view.findViewById(R.id.profile_image);
        TextView textView=(TextView) view.findViewById(R.id.payment_mtd);
        TextView aboutus=(TextView)view.findViewById(R.id.about_us_setting);
        TextView termndcnd=(TextView)view.findViewById(R.id.termndcnd_setting);


        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent circleimg=new Intent(getActivity(),Edit_Setting.class);
                startActivity(circleimg);

            }
        });


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent payment=new Intent(getActivity(),Payment_Setting.class);
                startActivity(payment);
            }
        });


        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abtus=new Intent(getActivity(),About_Us.class);
                startActivity(abtus);
            }
        });


        termndcnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tmndcd=new Intent(getActivity(),Nav_Setting_TeamandCond.class);
                startActivity(tmndcd);
            }
        });


        return view;




    }

}
