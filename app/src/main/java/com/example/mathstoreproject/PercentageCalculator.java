package com.example.mathstoreproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PercentageCalculator extends AppCompatActivity {

    EditText taka,discount,tk;

    Button btncal,btnreset,btnback2;
    TextView price;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage_calculator);

        taka = (EditText) findViewById(R.id.taka);

        discount = (EditText)  findViewById(R.id.discount);

        btncal = (Button) findViewById(R.id.btncal);

        btnreset = (Button) findViewById(R.id.btnreset);

        price = (TextView) findViewById(R.id.price);

        tk = (EditText) findViewById(R.id.tk);

        btnback2 = findViewById(R.id.buttonback2);

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                taka.setText(" ");
                discount.setText(" ");
                price.setText(" ");

                tk.setText(" ");

            }
        });

        btncal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                float percentage = Float.parseFloat(discount.getText().toString());

                float dec = percentage/100;
                float total = dec*Float.parseFloat(taka.getText().toString());
                float mr = -total+Float.parseFloat(taka.getText().toString());


                price.setText(Float.toString(mr));
                tk.setText(Float.toString(total));
            }
        });

        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PercentageCalculator.this,Calculator.class);

                startActivity(intent);
            }
        });
    }
    }
