package com.example.mathstoreproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Semester8 extends AppCompatActivity {



    private EditText m1,m2,m3,m4,m5,m6,m7,m8;

    private Button btn1,btn2,btn3;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester8);


        m1 = findViewById(R.id.mark1);
        m2 = findViewById(R.id.mark2);

        m3 = findViewById(R.id.mark3);

        m4 = findViewById(R.id.mark4);

        m5 = findViewById(R.id.mark5);

        m6 = findViewById(R.id.mark6);

        m7 = findViewById(R.id.mark7);

        m8 = findViewById(R.id.gpa);

        btn1 = findViewById(R.id.btn1);

        btn2 = findViewById(R.id.btn2);

        btn3 = findViewById(R.id.back);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double p1,p2,p3,p4,p5,p6,p7,sum,CGPA;

                p1 = Double.parseDouble(m1.getText().toString());

                p2 = Double.parseDouble(m2.getText().toString());

                p3 = Double.parseDouble(m3.getText().toString());

                p4 = Double.parseDouble(m4.getText().toString());

                p5 = Double.parseDouble(m5.getText().toString());

                p6 = Double.parseDouble(m6.getText().toString());

                p7 = Double.parseDouble(m7.getText().toString());


                sum= (p1*3+p2*2+p3*3+p4*2+p5*3+p6*4+p7*1);

                CGPA = (sum/18);

                m8.setText(String.valueOf(CGPA));
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m1.setText(" ");

                m2.setText(" ");

                m3.setText(" ");

                m4.setText(" ");

                m5.setText(" ");

                m6.setText(" ");

                m7.setText(" ");

                m8.setText(" ");


            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Semester8.this,Cgpacalculator.class);

                startActivity(intent);
            }
        });



    }
}