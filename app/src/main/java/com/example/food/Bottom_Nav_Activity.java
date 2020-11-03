package com.example.food;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottom_Nav_Activity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;



    private Fragment_home fragment_home;
    private Fragment_search fragment_search;
    private Fragment_shopping fragment_shopping;
    private Fragment_star fragment_star;
    private Fragment_setting fragment_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom__nav_);



        mMainFrame=(FrameLayout)findViewById(R.id.main_frame);
        mMainNav=(BottomNavigationView)findViewById(R.id.main_nav);

        fragment_home=new Fragment_home();
        fragment_search=new Fragment_search();
        fragment_shopping=new Fragment_shopping();
        fragment_star=new Fragment_star();
        fragment_setting=new Fragment_setting();


        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {

                    case R.id.home_frst:
                        setFragment(fragment_home);
                        return true;

                    case R.id.search:
                        setFragment(fragment_search);
                        return true;

                    case R.id.shopping:
                        setFragment(fragment_shopping);
                        return true;

                    case R.id.star:
                        setFragment(fragment_star);
                        return true;

                    case R.id.setting:
                        setFragment(fragment_setting);
                        return true;

                }

                return false;
            }

            private void setFragment(Fragment fragment) {


                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_frame,fragment);
                fragmentTransaction.commit();

            }
        });
    }
}
