package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class TipCalculator extends AppCompatActivity {

    public Button btnBack;
    public EditText edTxtTotal;
    public RadioButton rbTen;
    public RadioButton rbFifteen;
    public RadioButton rbTwenty;
    public RadioGroup rGroupPercent;
    public Button btnCalculate;
    public double percent;
    public TextView txtViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);

        btnBack = findViewById(R.id.btn_backid);
        btnCalculate = findViewById(R.id.btn_tip_calc);
        edTxtTotal = findViewById(R.id.edittxt_tip_total);
        rGroupPercent = findViewById(R.id.radioGroup);
        rbTen = findViewById(R.id.rbtn_one);
        rbFifteen = findViewById(R.id.rbtn_two);
        rbTwenty = findViewById(R.id.rbtn_three);
        txtViewResult = findViewById(R.id.tipToBeCalc);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(TipCalculator.this, MainActivity.class);
                startActivity(backIntent);
            }
        }); //end of back button listener

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                double total = Double.parseDouble(edTxtTotal.getText().toString());
                double result = total * percent;
                String strResult = Double.toString(result);
                txtViewResult.setText("  $"+strResult);
            }

        });
    }

    public void onRBOneClicked(View view){
        percent = 0.1;
        Toast.makeText(this, "10% Tip", Toast.LENGTH_SHORT).show();
    }

    public void onRBTwoClicked(View view){
        percent = 0.15;
        Toast.makeText(this, "15% Tip", Toast.LENGTH_SHORT).show();
    }

    public void onRBThreeClicked(View view){
        percent = 0.2;
        Toast.makeText(this, "20% Tip", Toast.LENGTH_SHORT).show();
    }



}