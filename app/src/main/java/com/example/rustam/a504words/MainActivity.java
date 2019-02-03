package com.example.rustam.a504words;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you finished?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(MainActivity.this, Started.class);
                        intent.putExtra("points", points);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    private Button B1;
    private Button B2;
    private Button B3;
    private Button B4;
    private Button B5;
    private TextView thetime;
    private boolean once_B1 = true;
    private boolean once_B2 = true;
    private boolean once_B3 = true;
    private boolean once_B4 = true;
    private boolean once_B5 = true;
    private int points = 0;
    private int refresh = 5;
    ArrayList<String> array;
    private Timer myTimer;
    private int time = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thetime = findViewById(R.id.thetime);
        myTimer = new Timer();
        myTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                TimerMethod();
            }

        }, 0, 1000);

        B1 = findViewById(R.id.B1);
        B2 = findViewById(R.id.B2);
        B3 = findViewById(R.id.B3);
        B4 = findViewById(R.id.B4);
        B5 = findViewById(R.id.B5);

        Intent intent =  getIntent();
        array = intent.getStringArrayListExtra("array");
        System.out.println(array.size());
        B1.setText(getrandom());
        B2.setText(getrandom());
        B3.setText(getrandom());
        B4.setText(getrandom());
        B5.setText(getrandom());
        B1.setBackgroundColor(Color.WHITE);
        B2.setBackgroundColor(Color.WHITE);
        B3.setBackgroundColor(Color.WHITE);
        B4.setBackgroundColor(Color.WHITE);
        B5.setBackgroundColor(Color.WHITE);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(once_B1) {
                    B1.setBackgroundColor(Color.GREEN);
                    points++;
                    once_B1 = false;
                }
                if(points >= refresh){
                    refresh += 5;
                    if(array.size() >= 5) {
                        once_B1 = true;
                        once_B2 = true;
                        once_B3 = true;
                        once_B4 = true;
                        once_B5 = true;
                        B1.setText(getrandom());
                        B2.setText(getrandom());
                        B3.setText(getrandom());
                        B4.setText(getrandom());
                        B5.setText(getrandom());
                        B1.setBackgroundColor(Color.WHITE);
                        B2.setBackgroundColor(Color.WHITE);
                        B3.setBackgroundColor(Color.WHITE);
                        B4.setBackgroundColor(Color.WHITE);
                        B5.setBackgroundColor(Color.WHITE);
                    }else {
                        Intent intent = new Intent(MainActivity.this, Started.class);
                        intent.putExtra("points", points);
                        startActivity(intent);
                    }
                }
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(once_B2) {
                    B2.setBackgroundColor(Color.GREEN);
                    points++;
                    once_B2 = false;
                }
                if(points >= refresh){
                    refresh += 5;
                    if(array.size() >= 5) {
                        once_B1 = true;
                        once_B2 = true;
                        once_B3 = true;
                        once_B4 = true;
                        once_B5 = true;
                        B1.setText(getrandom());
                        B2.setText(getrandom());
                        B3.setText(getrandom());
                        B4.setText(getrandom());
                        B5.setText(getrandom());
                        B1.setBackgroundColor(Color.WHITE);
                        B2.setBackgroundColor(Color.WHITE);
                        B3.setBackgroundColor(Color.WHITE);
                        B4.setBackgroundColor(Color.WHITE);
                        B5.setBackgroundColor(Color.WHITE);
                    }else {
                        Intent intent = new Intent(MainActivity.this, Started.class);
                        intent.putExtra("points", points);
                        startActivity(intent);
                    }
                }
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(once_B3) {
                    B3.setBackgroundColor(Color.GREEN);
                    points++;
                    once_B3 = false;
                }
                if(points >= refresh){
                    refresh += 5;
                    if(array.size() >= 5) {
                        once_B1 = true;
                        once_B2 = true;
                        once_B3 = true;
                        once_B4 = true;
                        once_B5 = true;
                        B1.setText(getrandom());
                        B2.setText(getrandom());
                        B3.setText(getrandom());
                        B4.setText(getrandom());
                        B5.setText(getrandom());
                        B1.setBackgroundColor(Color.WHITE);
                        B2.setBackgroundColor(Color.WHITE);
                        B3.setBackgroundColor(Color.WHITE);
                        B4.setBackgroundColor(Color.WHITE);
                        B5.setBackgroundColor(Color.WHITE);
                    }else {
                        Intent intent = new Intent(MainActivity.this, Started.class);
                        intent.putExtra("points", points);
                        startActivity(intent);
                    }
                }
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(once_B4) {
                    B4.setBackgroundColor(Color.GREEN);
                    points++;
                    once_B4 = false;
                }
                if(points >= refresh){
                    refresh += 5;
                    if(array.size() >= 5) {
                        once_B1 = true;
                        once_B2 = true;
                        once_B3 = true;
                        once_B4 = true;
                        once_B5 = true;
                        B1.setText(getrandom());
                        B2.setText(getrandom());
                        B3.setText(getrandom());
                        B4.setText(getrandom());
                        B5.setText(getrandom());
                        B1.setBackgroundColor(Color.WHITE);
                        B2.setBackgroundColor(Color.WHITE);
                        B3.setBackgroundColor(Color.WHITE);
                        B4.setBackgroundColor(Color.WHITE);
                        B5.setBackgroundColor(Color.WHITE);
                    }else {
                        Intent intent = new Intent(MainActivity.this, Started.class);
                        intent.putExtra("points", points);
                        startActivity(intent);
                    }
                }
            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(once_B5) {
                    B5.setBackgroundColor(Color.GREEN);
                    points++;
                    once_B5 = false;
                }

                if(points >= refresh){
                    refresh += 5;
                    if(array.size() >= 5) {
                        once_B1 = true;
                        once_B2 = true;
                        once_B3 = true;
                        once_B4 = true;
                        once_B5 = true;
                        B1.setText(getrandom());
                        B2.setText(getrandom());
                        B3.setText(getrandom());
                        B4.setText(getrandom());
                        B5.setText(getrandom());
                        B1.setBackgroundColor(Color.WHITE);
                        B2.setBackgroundColor(Color.WHITE);
                        B3.setBackgroundColor(Color.WHITE);
                        B4.setBackgroundColor(Color.WHITE);
                        B5.setBackgroundColor(Color.WHITE);
                    }else {
                        Intent intent = new Intent(MainActivity.this, Started.class);
                        intent.putExtra("points", points);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    private void TimerMethod()
    {
        //This method is called directly by the timer
        //and runs in the same thread as the timer.

        //We call the method that will work with the UI
        //through the runOnUiThread method.
        this.runOnUiThread(Timer_Tick);
    }

    public String getrandom(){
        int random = (int)(Math.random() * array.size());
        String temp = array.get(random);
        array.remove(random);
        System.out.println(array.size());
        return temp;
    }

    private Runnable Timer_Tick = new Runnable() {
        public void run() {
            time++;
            thetime.setText(time);
            if(time > 60){
                Intent intent = new Intent(MainActivity.this, Started.class);
                intent.putExtra("points", points);
                startActivity(intent);
            }
        }
    };
}
