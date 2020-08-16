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
    private Button tool1;
    private Button tool2;
    private Button tool3;
    private Button tool4;
    private Button getResult;

    void init(){
        show = findViewById(R.id.show);
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

    public void onClickNumber(View v) {
    }

}