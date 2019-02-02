package com.example.rustam.a504words;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Lesson extends AppCompatActivity {

    private Button go;
    private AutoCompleteTextView from;
    private AutoCompleteTextView to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        go = findViewById(R.id.b_go);
        from = findViewById(R.id.from);
        to = findViewById(R.id.to);

        List<String> temp = new ArrayList<>();
        for(int i = 0; i < 42; i++){
            temp.add("Lesson " + i);
        }

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
