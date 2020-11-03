package com.example.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class About_Us extends AppCompatActivity {


    private ViewPager mPager;

    private int[] layout = {R.layout.about_us_firstslide, R.layout.about_us_secondslide, R.layout.about_us_thirdslide};

    private MpagerAdapter mpagerAdepter;
    private LinearLayout Dots_Loyout;
    private ImageView[] dots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__us);

        mPager = findViewById(R.id.view_page);

        mpagerAdepter = new MpagerAdapter(layout, this);

        mPager.setAdapter(mpagerAdepter);

        Dots_Loyout = findViewById(R.id.dotlayout);

        createdots(0);

        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                createdots(position);

           /*if (position==layout.length-1)
           {
               nextbnt.setText("NEXT");
               skipbnt.setVisibility(View.INVISIBLE);
           }
           else {
               nextbnt.setText("NEXT");
               skipbnt.setVisibility(View.VISIBLE);
           }
*/
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void createdots(int current_position) {
        if (Dots_Loyout != null)
            Dots_Loyout.removeAllViews();

        dots = new ImageView[layout.length];
        for (int i = 0; i < layout.length; i++) {
            dots[i] = new ImageView(this);

            if (i == current_position) {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dots_selected));

            } else {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.defulet_dots));

            }

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(4, 0, 4, 0);

            Dots_Loyout.addView(dots[i], params);

        }
    }

    //  @Override
   /* public void onClick(View v) {
        switch (v.getId()) {
           // case R.id.bnskip:
               //skippages();
                //       new Perforaclass(this).writePerference();

               // break;

            //case R.id.bnnext:
                //         loadnextslid();
                //break;
        }

    }*/

}