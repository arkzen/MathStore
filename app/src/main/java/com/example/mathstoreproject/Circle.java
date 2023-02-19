package com.example.mathstoreproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circle extends AppCompatActivity {

    EditText base;

    Button btn1,btn2,btn3;

    TextView Area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        base = findViewById(R.id.base);

        btn1 = findViewById(R.id.btnres);

        btn2 = findViewById(R.id.btnreset);

        btn3 = findViewById(R.id.btnback);

        Area = findViewById(R.id.area);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double p1,pi=3.1416,areavalue;

                p1 = Double.parseDouble(base.getText().toString());

                areavalue = (pi*p1*p1);

                Area.setText("AREA = "+areavalue);


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                base.setText(" ");

                Area.setText(" ");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Circle.this,CalculationFormula.class);

                startActivity(intent);
            }
        });
    }
}