package com.example.rustam.a504words;

import android.content.Intent;
import android.os.SystemClock;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.rustam.a504words.Started.points_t1;
import static com.example.rustam.a504words.Started.points_t2;
import static com.example.rustam.a504words.Started.team;


public class Lesson extends AppCompatActivity {

    private ImageButton go;
    private TextView from;
    private TextView to;
    private TextView ptw;
    static ArrayList<String> array;
    static int ptw_n;
    private long mLastClickTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        go = findViewById(R.id.b_go);
        from = findViewById(R.id.t_from);
        to = findViewById(R.id.t_to);
        ptw = findViewById(R.id.ptw);


        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (from.getText().toString().isEmpty() || to.getText().toString().isEmpty() || ptw.getText().toString().isEmpty()) {
                        Snackbar.make(v, "Fill The Boxes", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    } else if (Integer.valueOf(from.getText().toString()) == 0 || Integer.valueOf(to.getText().toString()) == 0) {
                        Snackbar.make(v, "The Number Can't Be 0", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    } else if (Integer.valueOf(from.getText().toString()) > 42 || Integer.valueOf(to.getText().toString()) > 42) {
                        Snackbar.make(v, "Number Should Be Less Than 42", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    } else if (Integer.valueOf(to.getText().toString()) < Integer.valueOf(from.getText().toString())) {
                        Snackbar.make(v, "To Should Be Bigger Than From", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    } else if (Integer.valueOf(ptw.getText().toString()) <= 0) {
                        Snackbar.make(v, "Points To Win Should Be Bigger Than 0", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    } else {
                        if (SystemClock.elapsedRealtime() - mLastClickTime < 1000){
                            return;
                        }
                            mLastClickTime = SystemClock.elapsedRealtime();
                            team = 0;
                            points_t1 = 0;
                            points_t2 = 0;
                            ptw_n = Integer.valueOf(ptw.getText().toString());
                            Intent myIntent = new Intent(Lesson.this, Started.class);
                            array = new ArrayList<>(new Words(Integer.valueOf(from.getText().toString()), Integer.valueOf(to.getText().toString())).getwords());
                            startActivity(myIntent);

                    }
                }catch(Exception x){
                    Snackbar.make(v, "Error", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });
    }
}
