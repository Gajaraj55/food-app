package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static androidx.core.os.LocaleListCompat.create;

public class Newuser extends AppCompatActivity {

    Button fb;
    Button gg;

    TextView ed;
    TextView ed1;
    Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newuser);

        fb=(Button)findViewById(R.id.fb);
        gg=(Button)findViewById(R.id.google);
        ed=(TextView) findViewById(R.id.termand);
        ed1=(TextView) findViewById(R.id.policy);
        create=(Button)findViewById(R.id.createid);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fbb=new Intent(Intent.ACTION_VIEW);
                fbb.setData(Uri.parse("https://www.facebook.com/"));
                startActivity(fbb);
            }
        });


        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gog=new Intent(Intent.ACTION_VIEW);
                gog.setData(Uri.parse("https://www.google.com/"));
                startActivity(gog);
            }
        });

        ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tc=new Intent(Intent.ACTION_VIEW);
                tc.setData(Uri.parse("https://www.google.com/"));
                startActivity(tc);
            }
        });

        ed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pp=new Intent(Intent.ACTION_VIEW);
                pp.setData(Uri.parse("https://www.google.com/"));
                startActivity(pp);
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ct=new Intent(Newuser.this,OTP.class);
                startActivity(ct);
            }
        });


    }
}

