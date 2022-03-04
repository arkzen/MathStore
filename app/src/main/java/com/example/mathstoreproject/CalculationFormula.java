package com.example.mathstoreproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculationFormula extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_formula);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btn1 = findViewById(R.id.button1);

        btn2 = findViewById(R.id.button2);

        btn3 = findViewById(R.id.button3);

        btn4 = findViewById(R.id.button4);

        btn5 = findViewById(R.id.button5);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CalculationFormula.this,TriangleA.class);

                startActivity(intent);

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(CalculationFormula.this,Rectangle.class);
                startActivity(intent);

            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CalculationFormula.this,Circle.class);

                startActivity(intent);


            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 Intent intent  = new Intent(CalculationFormula.this,Square.class);

                 startActivity(intent);

            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalculationFormula.this,Formula.class);

                startActivity(intent);
            }
        });
    }
}