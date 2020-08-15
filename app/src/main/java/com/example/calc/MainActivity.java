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

    private EditText tEdit;
    private EditText tEdit2;
    private Button bttn1;
    private Button bttn2;
    private TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tEdit = findViewById(R.id.input);
        tEdit2 = findViewById(R.id.input2);
        bttn1 = findViewById(R.id.button_add);
        bttn2 = findViewById(R.id.button_sub);
        tView = findViewById(R.id.textview);
        final CalculatorImpl calculator = new CalculatorImpl();

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = calculator.add(Integer.parseInt(String.valueOf(tEdit.getText())), Integer.parseInt(String.valueOf(tEdit2.getText())));
                tView.setText(String.valueOf(result));
            }
        });
    }

}