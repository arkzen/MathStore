package com.example.mathstoreproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cgpacalculator extends AppCompatActivity {

    Button m1,m2,m3,m4,m5,m6,m7,m8,btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpacalculator);



        m1 = findViewById(R.id.button1);

        m2  = findViewById(R.id.button2);

        m3 = findViewById(R.id.button3);

        m4 = findViewById(R.id.button4);

        m5 = findViewById(R.id.button5);

        m6  = findViewById(R.id.button6);

        m7 = findViewById(R.id.button7);

        m8 = findViewById(R.id.button8);

        btn = findViewById(R.id.buttonback3);



        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(Cgpacalculator.this,Semester1.class);

               startActivity(intent);
            }
        });


        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cgpacalculator.this,Semester2.class);

                startActivity(intent);

            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cgpacalculator.this,Semester3.class);

                startActivity(intent);

            }
        });

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cgpacalculator.this,Semester4.class);

                startActivity(intent);
            }
        });


        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cgpacalculator.this,Semester5.class);

                startActivity(intent);
            }
        });

        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cgpacalculator.this,Semester6.class);

                startActivity(intent);
            }
        });

        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cgpacalculator.this,Semester7.class);

                startActivity(intent);
            }
        });

        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cgpacalculator.this,Semester8.class);

                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cgpacalculator.this,Calculator.class);

                startActivity(intent);

            }
        });



    }
}