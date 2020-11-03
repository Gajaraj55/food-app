package com.example.food;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.food.R;

public class Perforaclass {


    private Context context;
    private SharedPreferences sharedPreferences;

    // parmiter contecter and pass the Context Data type
    public Perforaclass(Context context)
    {
        this.context=context;
        getsharPerference();
    }

    private void getsharPerference()
    {
        sharedPreferences=context.getSharedPreferences(context.getString(R.string.my_performance),Context.MODE_PRIVATE);

    }

    public void writePerference()
    {
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(context.getString(R.string.my_perference_key),"Edit ok");
        editor.commit();
    }

    public boolean checkPerfernce()
    {
        boolean status=false;

        if (sharedPreferences.getString(context.getString(R.string.my_perference_key),"Null").equals("null"))
        {
            status=false;
        }
        else {
            status=true;
        }
        return status;
    }

    public void clearPerfernce()
    {
        sharedPreferences.edit().clear().commit();
    }
}
