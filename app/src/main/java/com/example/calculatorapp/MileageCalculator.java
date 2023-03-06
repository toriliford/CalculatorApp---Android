package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MileageCalculator extends AppCompatActivity {

    public Button btnBack;
    public Button btnCalc;
    public EditText gallonsHeldET;
    public EditText milesDrivenET;
    public TextView mpgTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mileage_calculator);

        btnBack = findViewById(R.id.btn_backid);

        btnBack.setOnClickListener(view -> {
            Intent backIntent = new Intent(MileageCalculator.this, MainActivity.class);
            startActivity(backIntent);
        }); //end of back button listener

        //set edittext
        gallonsHeldET = findViewById(R.id.edTxtOne);
        milesDrivenET = findViewById(R.id.edTxtTwo);

        //get textview where total will be stored
        mpgTxtView = findViewById(R.id.finalTxtView);

        btnCalc = findViewById(R.id.btn_gas_calc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int milesDriven = Integer.parseInt(milesDrivenET.getText().toString());
                int gallonsTankHolds = Integer.parseInt(gallonsHeldET.getText().toString());

                int milesPerGallon = milesDriven / gallonsTankHolds;
                String mpgStr = Integer.toString(milesPerGallon) + " MPG";

                mpgTxtView.setText(mpgStr);
            }
        });
    }
}