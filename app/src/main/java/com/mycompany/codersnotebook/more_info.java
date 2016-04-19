package com.mycompany.codersnotebook;

import android.os.Bundle;
import android.app.Activity;
import android.util.DisplayMetrics;

public class more_info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * 0.6) , (int)(height *0.6));
    }

}
