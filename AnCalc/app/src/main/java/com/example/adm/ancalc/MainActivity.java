package com.example.adm.ancalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonResult,buttonDev,buttonPlus,buttonMinus,buttonMultiple,buttonClear;
    TextView textView;
    double Result,x1,x2;
    int Operation=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button10);
        button1 = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonMultiple = (Button)findViewById(R.id.button13);
        buttonMinus = (Button)findViewById(R.id.button11);
        buttonPlus =  (Button)findViewById(R.id.button12);
        buttonDev = (Button) findViewById(R.id.button14);
        buttonResult = (Button)findViewById(R.id.buttonResult);
        textView = (TextView) findViewById(R.id.Result);
        buttonClear = (Button) findViewById(R.id.CE);



        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button:
                        Result=Result*10+1;
                        textView.setText(String.valueOf(Result));
                        break;
                    case R.id.button2:
                        Result=Result*10+2;
                        textView.setText(String.valueOf(Result));
                        break;
                    case R.id.button3:
                        Result=Result*10+3;
                        textView.setText(String.valueOf(Result));
                        break;
                    case R.id.button4:
                        Result=Result*10+4;
                        textView.setText(String.valueOf(Result));
                        break;
                    case R.id.button5:
                        Result=Result*10+5;
                        textView.setText(String.valueOf(Result));
                        break;
                    case R.id.button6:
                        Result=Result*10+6;
                        textView.setText(String.valueOf(Result));
                        break;
                    case R.id.button7:
                        Result=Result*10+7;
                        textView.setText(String.valueOf(Result));break;
                    case R.id.button8: textView.setText("8");
                        Result=Result*10+8;
                        textView.setText(String.valueOf(Result));break;
                    case R.id.button9: Result=Result*10+9;
                        textView.setText(String.valueOf(Result));
                        break;
                    case R.id.button10:
                        Result=Result*10;
                        textView.setText(String.valueOf(Result));
                        break;
                    case R.id.CE:
                        Result=0;
                        textView.setText(String.valueOf(Result));
                        break;
                    case R.id.button13:
                        Operation=1;
                        x1=Result;
                        Result=0;
                        break;
                    case R.id.button14:
                        Operation=2;
                        x1=Result;
                        Result=0;
                        break;
                    case R.id.button12:
                        Operation=3;
                        x1=Result;
                        Result=0;
                        break;
                    case R.id.button11:
                        Operation=4;
                        x1=Result;
                        Result=0;
                        break;



                    case R.id.buttonResult:
                    if (Operation==1)
                        Result=x1*Result;
                    if (Operation==2)
                        Result=x1/Result;
                    if (Operation==3)
                        Result=x1+Result;
                    if (Operation==4)
                        Result=x1-Result;
                        textView.setText(String.valueOf(Result));
                    break;

                }


            }
        };

        button0.setOnClickListener(onClickListener);
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);
        buttonClear.setOnClickListener(onClickListener);
        buttonResult.setOnClickListener(onClickListener);
        buttonDev.setOnClickListener(onClickListener);
        buttonPlus.setOnClickListener(onClickListener);
        buttonMinus.setOnClickListener(onClickListener);
        buttonMultiple.setOnClickListener(onClickListener);
    }
}
