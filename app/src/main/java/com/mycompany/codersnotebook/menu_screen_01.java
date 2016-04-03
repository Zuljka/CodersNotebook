package com.mycompany.codersnotebook;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class menu_screen_01 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen_01);

        Button html_content_01 = (Button) findViewById(R.id.html_content_01);
        html_content_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), html_01.class);
                startActivityForResult(intent, 0);
            }
        });

        Button html_content_02 = (Button) findViewById(R.id.html_content_02);
        html_content_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), html_02.class);
                startActivityForResult(intent, 0);
            }
        });
    }

}
