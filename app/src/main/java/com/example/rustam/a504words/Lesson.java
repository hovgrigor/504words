package com.example.rustam.a504words;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class Lesson extends AppCompatActivity {

    private Button go;
    private TextView from;
    private TextView to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        go = findViewById(R.id.b_go);
        from = findViewById(R.id.t_from);
        to = findViewById(R.id.t_to);



        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n_from = Integer.valueOf(from.getText().toString());
                int n_to = Integer.valueOf(to.getText().toString());
                System.out.println("From: " + n_from + "   " + "To: " + n_to);
                if(from.getText().toString().isEmpty() || to.getText().toString().isEmpty()) {
                    Snackbar.make(v, "Fill The Boxes", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }else if(n_from == 0 || n_to == 0){
                    Snackbar.make(v, "The Number Can't Be 0", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }else if(n_from > 42 || n_to > 42){
                    Snackbar.make(v, "Number Should Be Less Than 42", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }else if(n_to < n_from){
                    Snackbar.make(v, "'To' Should Be Bigger Than 'From'", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }else {
                    Intent myIntent = new Intent(Lesson.this, Started.class);
                    ArrayList<String> array = new ArrayList<>(new Words(n_from, n_to).getwords());
                    myIntent.putStringArrayListExtra("array", array);
                    startActivity(myIntent);
                }
            }
        });
    }
}
