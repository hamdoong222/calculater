package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calc.homework.Calculator;
import com.example.calc.homework.CalculatorImpl;

public class MainActivity extends AppCompatActivity {

    private TextView show;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button num0;
    private Button tool1;
    private Button tool2;
    private Button tool3;
    private Button tool4;
    private Button getResult;

    void init(){
        show = findViewById(R.id.show);
        num1 = findViewById(R.id.num1);
        num1 = findViewById(R.id.num1);
        num1 = findViewById(R.id.num1);
        num1 = findViewById(R.id.num1);
        num0 = findViewById(R.id.num0);
        num0 = findViewById(R.id.num0);
        num0 = findViewById(R.id.num0);
        num0 = findViewById(R.id.num0);
        getResult = findViewById(R.id.getResult);
        tool1 = findViewById(R.id.tool1);
        tool2 = findViewById(R.id.tool2);
        tool3 = findViewById(R.id.tool3);
        tool4 = findViewById(R.id.tool4);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();



    }

}