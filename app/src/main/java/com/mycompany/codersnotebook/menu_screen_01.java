package com.mycompany.codersnotebook;

import android.content.Intent;
import android.media.MediaPlayer;
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

        Button html_content_03 = (Button) findViewById(R.id.html_content_03);
        html_content_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), html_03.class);
                startActivityForResult(intent, 0);
            }
        });

        Button html_content_04 = (Button) findViewById(R.id.html_content_04);
        html_content_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), html_04.class);
                startActivityForResult(intent, 0);
            }
        });

        Button html_content_05 = (Button) findViewById(R.id.html_content_05);
        html_content_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), html_05.class);
                startActivityForResult(intent, 0);
            }
        });

        Button html_content_06 = (Button) findViewById(R.id.html_content_06);
        html_content_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), html_06.class);
                startActivityForResult(intent, 0);
            }
        });

        Button html_content_07 = (Button) findViewById(R.id.html_content_07);
        html_content_07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), html_07.class);
                startActivityForResult(intent, 0);
            }
        });
    }

}
