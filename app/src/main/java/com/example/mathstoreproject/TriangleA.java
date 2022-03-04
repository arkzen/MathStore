package com.example.mathstoreproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TriangleA extends AppCompatActivity {

    EditText Base,Height;

    Button btn1,btn2,btn3;

    TextView Area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        Base = findViewById(R.id.base);

        Height = findViewById(R.id.height);

        Area  = findViewById(R.id.area);

        btn1 = findViewById(R.id.btnres);

        btn2 = findViewById(R.id.btnreset);

        btn3 = findViewById(R.id.btnback);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String Strweight = Base.getText().toString();
                String Strheight = Height.getText().toString();

                if (Strweight.equals(" "))
                {

                    Base.setError("Place Enter Your Base");
                    Base.requestFocus();
                    return;
                }
                if (Strheight.equals(" "))
                {

                    Height.setError("Place Enter Your Height");
                    Height.requestFocus();
                    return;
                }

                float Base = Float.parseFloat(Strweight);

                float Height  = Float.parseFloat(Strheight);

              float calculatearea = (float) (0.5*Base*Height);

                Area.setText("AREA = "+calculatearea);


            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Base.setText(" ");

                Height.setText(" ");

                Area.setText(" ");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TriangleA.this,CalculationFormula.class);

                startActivity(intent);



            }
        });
    }
}