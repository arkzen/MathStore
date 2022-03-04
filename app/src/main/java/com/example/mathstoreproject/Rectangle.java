package com.example.mathstoreproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangle extends AppCompatActivity {

    EditText lenght,width;

    Button btn1,btn2,btn3;

    TextView Area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        lenght = findViewById(R.id.lenght);

        width = findViewById(R.id.width);

        Area = findViewById(R.id.area);

        btn1 = findViewById(R.id.btnres);

        btn2 = findViewById(R.id.btnreset);

        btn3 = findViewById(R.id.btnback);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               double p1,p2,area;

               p1= Double.parseDouble(lenght.getText().toString());

               p2 = Double.parseDouble(width.getText().toString());

               area = (p1*p2);

               Area.setText("AREA = "+area);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lenght.setText(" ");

                width.setText(" ");

                Area.setText(" ");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Rectangle.this,CalculationFormula.class);
                startActivity(intent);

            }
        });

    }
}