package com.example.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Welcome1 extends AppCompatActivity {

    private ViewPager mPager;

    private int[] layout={R.layout.first_slide,R.layout.second_slide,R.layout.third_slide,R.layout.fourth_slide};
    private MpagerAdapter mpagerAdepter;
    private LinearLayout Dots_Loyout;
    private ImageView[] dots;

    private Button skipbnt,nextbnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT>=19)
        {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

          setContentView(R.layout.activity_welcome1);

        mPager=findViewById(R.id.view_page);

        mpagerAdepter=new MpagerAdapter(layout,this);

        mPager.setAdapter(mpagerAdepter);

        Dots_Loyout=findViewById(R.id.dotlayout);

        skipbnt=findViewById(R.id.bnskip);
        nextbnt=findViewById(R.id.bnnext);

      skipbnt.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent skp=new Intent(Welcome1.this,Loginpage.class);
              startActivity(skp);
          }
      });

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

    private void createdots(int current_position)
    {
        if (Dots_Loyout!=null)
            Dots_Loyout.removeAllViews();

        dots=new ImageView[layout.length];
        for (int i=0;i<layout.length;i++)
        {
            dots[i]=new ImageView(this);

            if (i==current_position)
            {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.active_dots));

            }
            else {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.defulet_dots));

            }

            LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(4,0,4,0);

            Dots_Loyout.addView(dots[i],params);

        }

        nextbnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int next_slide=mPager.getCurrentItem()+1;
                if (next_slide<layout.length)
                {
                    mPager.setCurrentItem(next_slide);
                }
                else {
                    Intent nn=new Intent(Welcome1.this,Loginpage.class);
                    startActivity(nn);
                }
            }
        });
    }


}