package darkzen.studios.mathstoreproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculator extends AppCompatActivity {

    Button btn1,btn2,btn3,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3  = findViewById(R.id.button3);
        btn5 = findViewById(R.id.button5);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Calculator.this,ScientificCalculator.class);

                startActivity(intent);


            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calculator.this,BmiCalculator.class);

                startActivity(intent);
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Calculator.this,PercentageCalculator.class);

                startActivity(intent);

            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calculator.this,MainActivity.class);

                startActivity(intent);
            }
        });


    }
}