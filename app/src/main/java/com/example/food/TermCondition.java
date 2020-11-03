package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TermCondition extends AppCompatActivity {

    Button de;
    Button ap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_condition);
        de=(Button)findViewById(R.id.decline);
        ap=(Button)findViewById(R.id.accept);


        de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dec=new Intent(TermCondition.this,Newuser.class);
                startActivity(dec);
            }
        });

        ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apt=new Intent(TermCondition.this,Userlogin.class);
                startActivity(apt);
            }
        });
    }
}
