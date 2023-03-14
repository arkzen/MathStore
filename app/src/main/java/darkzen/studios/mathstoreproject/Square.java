package darkzen.studios.mathstoreproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Square extends AppCompatActivity {

    EditText dia;
    Button btn1,btn2,btn3;

    TextView Area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        dia = findViewById(R.id.diagonal);

        btn1 = findViewById(R.id.btnres);

        btn2 = findViewById(R.id.btnreset);

        btn3 = findViewById(R.id.btnback);

        Area = findViewById(R.id.area);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double p1,basevalue;

                p1 = Double.parseDouble(dia.getText().toString());

                basevalue = (p1*p1);

                Area.setText("AREA = "+basevalue);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia.setText(" ");

                Area.setText(" ");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Square.this,CalculationFormula.class);

                startActivity(intent);
            }
        });
    }
}