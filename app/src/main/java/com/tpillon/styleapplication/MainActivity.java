package com.tpillon.styleapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonWithListener);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor();
            }
        });
    }

    public void changeColorOnClick(View view) {
        changeColor();
    }

    private void changeColor() {
        TextView textToChange = findViewById(R.id.textToChange);

        // SOURCE : https://stackoverflow.com/questions/5280367/android-generate-random-color-on-click?answertab=votes#tab-top
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        textToChange.setBackgroundColor(color);

    }
}
