package darkzen.studios.mathstoreproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScientificCalculator extends AppCompatActivity {


    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, bpi, bequal, bplus, bmin, bmul, bdiv, binv, bsqrt, bsquare, bfact, bln, blog, btan, bcos, bsin, bb1, bb2, bc, bac,backman;

    TextView tvsec, tvmain;
    String pi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);



        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);

        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);

        bdot = findViewById(R.id.bdot);
        bpi = findViewById(R.id.bpi);
        bplus = findViewById(R.id.bplus);
        bequal = findViewById(R.id.bequal);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        bsqrt = findViewById(R.id.bsqrt);
        bsquare = findViewById(R.id.bsquare);
        bfact = findViewById(R.id.bfact);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bcos = findViewById(R.id.bcos);
        bsin = findViewById(R.id.bsin);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        backman = findViewById(R.id.backman);


        backman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(ScientificCalculator.this,Calculator.class);

                startActivity(intent);

            }
        });



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + "1");

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "3");

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "5");


            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + "0");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + ".");
            }
        });

        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + "π");
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(" ");
                tvsec.setText(" ");
            }
        });


        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val = tvmain.getText().toString();

                val = val.substring(0, val.length() - 1);

                tvmain.setText(val);
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + "+");
            }
        });


        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + "-");
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + "×");
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + "÷");
            }
        });

        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String val = tvmain.getText().toString();

                double r = Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));
            }
        });

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + "(");
            }
        });


        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + ")");
            }
        });


        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText() + pi);
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tvmain.setText(tvmain.getText() + "sin");
            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tvmain.setText(tvmain.getText() + "cos");
            }
        });


        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tvmain.setText(tvmain.getText() + "tan");
            }
        });


        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tvmain.setText(tvmain.getText() + "^"+"(-1)");
            }
        });

        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int val = Integer.parseInt(tvmain.getText().toString());

                int fact =  factorail(val);

                tvmain.setText(String.valueOf(fact));

                tvsec.setText(val + "!");
            }
        });

        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvmain.getText().toString());
                double square = d * d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d + "2");
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"ln");
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"log");
            }
        });


        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();

                String replaceddstr = val.replace('÷','/').replace('×','*');

                double result = eval(replaceddstr);

                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);

            }
        });
    }


    int factorail(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorail(n - 1);
    }

    // evan function

    public static double eval(final String str) {


        return new Object() {
            int pos = -1, ch;

            void nextchar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextchar();
                if (ch == charToEat) {
                    nextchar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextchar();
                double x = ParseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            public double ParseExpression() {
                double x = ParseTerm();
                for (; ; ) {
                    if (eat('+')) x += ParseTerm();
                    else if (eat('-')) x -= ParseTerm();
                    return x;
                }
            }

            private double ParseTerm() {
                double x = ParseFactor();
                for (; ; ) {
                    if (eat('*')) x *= ParseFactor();
                    else if (eat('/')) x /= ParseFactor();

                    return x;
                }

            }

            private double ParseFactor() {

                if (eat('+')) return ParseFactor();

                if (eat('-')) return -ParseFactor();

                double x;

                int startPos = this.pos;

                if (eat('(')) {
                    x = ParseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {

                    while ((ch >= '0' && ch <= '9') || ch == '.') nextchar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') nextchar();

                    String func = str.substring(startPos, this.pos);
                    x = ParseFactor();

                    if (func.equals("sqrt")) x = Math.sqrt(x);

                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log(Math.toRadians(x));
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                if (eat('^')) x = Math.pow(x, ParseFactor());
                return x;
            }
        }.parse();
    }


}
