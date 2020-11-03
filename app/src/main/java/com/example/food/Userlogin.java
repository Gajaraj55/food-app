package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.logging.LogManager;

public class Userlogin extends AppCompatActivity {

    Button sinfb;
    Button singoog;
    private  TextView dialo;

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);

        sinfb=(Button)findViewById(R.id.singfb);
        singoog=(Button)findViewById(R.id.singgoogle);
        dialo=(TextView)findViewById(R.id.forgotpwd);

        login=(Button)findViewById(R.id.usrlogin);




        sinfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f=new Intent(Intent.ACTION_VIEW);
                f.setData(Uri.parse("https://www.facebook.com/"));
                startActivity(f);
            }
        });

        singoog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent g=new Intent(Intent.ACTION_VIEW);
                g.setData(Uri.parse("https://www.google.com/"));
                startActivity(g);

            }
        });

        dialo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("cicked dialogue !");
                final Dialog dialog = new Dialog(Userlogin.this);
                dialog.setContentView(R.layout.dialogbox);
                dialog.show();

                Button declineButton = (Button) dialog.findViewById(R.id.close);
                Button rspw = (Button) dialog.findViewById(R.id.restpwd);
                declineButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();

                    }
                });
                System.out.println("now to execute rspw button code!");
                rspw.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent respwt=new Intent(getApplicationContext(),ResetPassword.class);
                        startActivity(respwt);
                    }
                });
            }
        });

     login.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent usrlg=new Intent(Userlogin.this,Bottom_Nav_Activity.class);
             startActivity(usrlg);
         }
     });

    }

}
