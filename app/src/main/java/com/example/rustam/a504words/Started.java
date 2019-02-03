package com.example.rustam.a504words;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.rustam.a504words.Lesson.array;
import static com.example.rustam.a504words.Lesson.ptw_n;

public class Started extends AppCompatActivity {
    private Button start;
    private TextView t_team;
    private TextView f_team;
    private TextView s_team;
    static int team;
    static int points_t1;
    static int points_t2;
    boolean preventSecondClick = false;

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(Started.this, Main.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_started);
        start = findViewById(R.id.b_start);
        t_team = findViewById(R.id.t_team);
        f_team = findViewById(R.id.Team1);
        s_team = findViewById(R.id.Team2);

        Intent intent =  getIntent();
        int points = intent.getIntExtra("points", 0);
        System.out.println(points);

        team++;
        if(team % 2 == 0){
            t_team.setText("Second Team");
            points_t1 += points;
            //System.out.println("Team 1: " + points_t1);
        }else{
            t_team.setText("First Team");
            points_t2 += points;
           //System.out.println("Team 2: " + points_t2);
        }

        f_team.setText(points_t1 + "");
        s_team.setText(points_t2 + "");

        if(points_t1 >= ptw_n){
            new AlertDialog.Builder(this)
                    .setMessage("First Team Wins!!!")
                    .setCancelable(false)
                    .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent intent = new Intent(Started.this, Main.class);
                            points_t1 = 0;
                            points_t2 = 0;
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }
                    }).show();
        }else if(points_t2 >= ptw_n){
            new AlertDialog.Builder(this)
                    .setMessage("Second Team Wins!!!")
                    .setCancelable(false)
                    .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent intent = new Intent(Started.this, Main.class);
                            points_t1 = 0;
                            points_t2 = 0;
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }
                    }).show();
        }




        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!preventSecondClick) {
                    preventSecondClick = true;
                    Intent myIntent = new Intent(Started.this, MainActivity.class);
                    myIntent.putStringArrayListExtra("array", array);
                    startActivity(myIntent);
                }
            }
        });

    }
}
