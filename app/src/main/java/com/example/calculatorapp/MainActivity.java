package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //create button objects
    public Button btnToTipCalc;
    public Button btnToGasCalc;
    public Button btnToAgeCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnToTipCalc = findViewById(R.id.tip_calc_button);
        btnToGasCalc = findViewById(R.id.gas_calc_button);
        btnToAgeCalc = findViewById(R.id.age_calc_button);

        //set onclick listener for tipcalc page
        btnToTipCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tipIntent = new Intent(MainActivity.this, TipCalculator.class);
                startActivity(tipIntent);
            }
        }); //end of tip Onclick

        //set onclick listener for gascalc page
        btnToGasCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gasIntent = new Intent(MainActivity.this, MileageCalculator.class);
                startActivity(gasIntent);
            }
        }); //end of mileage Onclick

        //set onclick listener for petAgeCalc page
        btnToAgeCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ageIntent = new Intent(MainActivity.this, PetAgeCalculator.class);
                startActivity(ageIntent);
            }
        }); //end of age Onclick


    }
}