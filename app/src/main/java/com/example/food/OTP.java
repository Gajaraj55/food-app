package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OTP extends AppCompatActivity {

    Button otbsub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        otbsub=(Button)findViewById(R.id.otbsubmit);

        otbsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otbsb=new Intent(OTP.this,TermCondition.class);
                startActivity(otbsb);
            }
        });
    }
}
