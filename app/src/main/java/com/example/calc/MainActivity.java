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

//프로그램이 종료될때 종료되는 클래스
//엑티비티가 있는 동안은 종료함수를 호출하지 않으면 프로그램은 계속 떠있음
public class MainActivity extends AppCompatActivity {

    private TextView show;
    private Button tool1;
    private Button tool2;
    private Button tool3;
    private Button tool4;
    private Button getResult;

    //public으로 할 필요가 없음: 접근제한자 주의하기!
    private ButtonInterface buttonInterface = new ButtonInterface();

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
        int item = Integer.parseInt(v.getTag().toString());
        buttonInterface.onButton(item);
        show.setText(buttonInterface.getExpression());

    }

    public void onClickTool(View v){
        String item = v.getTag().toString();
        if(item.equals("+")){
            buttonInterface.onButton(ButtonInterface.Type.ADD);
        }
        else if(item.equals("-")){
            buttonInterface.onButton(ButtonInterface.Type.SUBTRACT);
        }
        else if(item.equals("*")){
            buttonInterface.onButton(ButtonInterface.Type.MULTIPLE);
        }
        else if(item.equals("/")){
            buttonInterface.onButton(ButtonInterface.Type.DIVIDE);
        }
        show.setText(buttonInterface.getExpression());
    }

    public void onClickResult(View v){
        int result = buttonInterface.doMath();
        String re = Integer.toString(result);
        show.setText(re);
    }

}