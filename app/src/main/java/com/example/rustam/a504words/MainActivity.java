package com.example.rustam.a504words;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you finished?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(MainActivity.this, Started.class);
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

    ArrayList<String> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    }

    public String getrandom(){
        int random = (int)(Math.random() * array.size());
        String temp = array.get(random);
        array.remove(random);
        System.out.println(array.size());
        return temp;
    }
}
