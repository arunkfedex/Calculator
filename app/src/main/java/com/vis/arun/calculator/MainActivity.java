package com.vis.arun.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.vis.arun.calculator.api.ArithmeticCalculator;
import com.vis.arun.calculator.api.Calculator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText result;
    Button bt_1;
    private List<Button> numberButtonList;
    Calculator calculator = new ArithmeticCalculator();

    private void initButtons() {


        numberButtonList = new ArrayList() {
            {
                add(findViewById(R.id.bt_0));
                add(findViewById(R.id.bt_1));
                add(findViewById(R.id.bt_2));
                add(findViewById(R.id.bt_3));
                add(findViewById(R.id.bt_4));
                add(findViewById(R.id.bt_5));
                add(findViewById(R.id.bt_6)); 
                add(findViewById(R.id.bt_7));
                add(findViewById(R.id.bt_8));
                add(findViewById(R.id.bt_9));
            }
        };

       for(Button btn : numberButtonList){
           btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                  // result.setText(calculator.addOperand(btn.getText().toString()));
               }
           });
       }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (EditText) findViewById(R.id.et_result);
        initButtons();
    }
    public void btnEqualClicked(View view) {
        result.setText("=");
    }

    public void btnDotClicked(View view) {
        result.setText(".");
    }

    public void btnCClicked(View view) {
        result.setText("");
    }

    public void btnDivClicked(View view) {
        result.setText("0");
    }

    public void btnMultiClicked(View view) {
        result.setText("=");
    }

    public void btnMinusClicked(View view) {
        result.setText(".");
    }

    public void btnPlusClicked(View view) {
        result.setText("");
    }

    public void btnCEClicked(View view) {
        result.setText("");
    }

    public void btnDelClicked(View view) {
        result.setText("");
    }

    public void btnSignClicked(View view) {
        result.setText("");
    }
}
