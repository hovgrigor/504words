package com.example.rustam.a504words;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main extends AppCompatActivity {

    private ImageButton play;
    private ImageButton about;
    private long mLastClickTime1 = 0;
    private long mLastClickTime2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        play = findViewById(R.id.play);
        about = findViewById(R.id.b_about);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SystemClock.elapsedRealtime() - mLastClickTime1 < 1000){
                    return;
                }
                mLastClickTime1 = SystemClock.elapsedRealtime();
                startActivity(new Intent(Main.this, Lesson.class));
                }
            });


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SystemClock.elapsedRealtime() - mLastClickTime2 < 1000){
                    return;
                }
                mLastClickTime2 = SystemClock.elapsedRealtime();
                startActivity(new Intent(Main.this, About.class));
                }
            });
    }
}
