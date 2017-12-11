package com.example.ornichola.simplecalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText value01, value02;
    TextView result;
    Button add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value01 = (EditText)findViewById(R.id.value01);
        value02 = (EditText)findViewById(R.id.value02);
        add = (Button)findViewById(R.id.buttonAdd);
        subtract = (Button)findViewById(R.id.buttonSubtract);
        multiply = (Button)findViewById(R.id.buttonMultiply);
        divide = (Button)findViewById(R.id.buttonDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value01.getText().length() != 0 && value02.getText().length() != 0) {
                    double v1 = Double.parseDouble(value01.getText().toString());
                    double v2 = Double.parseDouble(value02.getText().toString());
                    double res = v1 + v2;

                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("RESULT", res);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(v.getContext(),"Введите оба числа!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value01.getText().length() != 0 && value02.getText().length() != 0) {
                    double v1 = Double.parseDouble(value01.getText().toString());
                    double v2 = Double.parseDouble(value02.getText().toString());
                    double res = v1 - v2;

                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("RESULT", res);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(v.getContext(),"Введите оба числа!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value01.getText().length() != 0 && value02.getText().length() != 0) {
                    double v1 = Double.parseDouble(value01.getText().toString());
                    double v2 = Double.parseDouble(value02.getText().toString());
                    double res = v1 * v2;

                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("RESULT", res);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(v.getContext(),"Введите оба числа!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value01.getText().length() != 0 && value02.getText().length() != 0) {
                    double v1 = Double.parseDouble(value01.getText().toString());
                    double v2 = Double.parseDouble(value02.getText().toString());
                    if (v2 == 0) {
                        Toast.makeText(v.getContext(),"На ноль делить нельзя!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        double res = v1 / v2;

                        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                        intent.putExtra("RESULT", res);
                        startActivity(intent);
                    }
                }
                else {
                    Toast.makeText(v.getContext(),"Введите оба числа!",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
