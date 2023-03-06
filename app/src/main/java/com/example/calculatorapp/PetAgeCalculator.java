package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class PetAgeCalculator extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public Button btnBack;
    public Button ageCalcBtn;
    public EditText ETAge;

    public TextView finalAgeTV;
    public Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_age_calculator);

        //create back button object and listener
        btnBack = findViewById(R.id.btn_backid);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(PetAgeCalculator.this, MainActivity.class);
                startActivity(backIntent);
            }
        }); //end of back button listener

        Pet.popPetArray();
        spinner = findViewById(R.id.spinner_species);
        ArrayAdapter<Pet> adapter = new ArrayAdapter<Pet>(this,
                android.R.layout.simple_spinner_item, Pet.petArrayList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        ETAge = findViewById(R.id.edTxtAge);

        finalAgeTV = findViewById(R.id.ageTxtViewFinal);

        ageCalcBtn = findViewById(R.id.btnCalcAge);

        ageCalcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pet pet = (Pet) spinner.getSelectedItem();
                int petAgeFinal;
                int actualPetAge = Integer.parseInt(ETAge.getText().toString());
                //if pet is 1 year old, set to initial age
                if(actualPetAge <= 1) {
                    petAgeFinal = pet.getInitialAge();
                }
                //else if pet is older than one, calculate.
                //age given by user minus one (for first year, initial age added)
                //times the multiplier of the pet object, plus the initial age
                else {
                    petAgeFinal = pet.getInitialAge() + ((Integer.parseInt(ETAge.getText().toString()) - 1) * pet.getMultiplier());
                }

                finalAgeTV.setText(Integer.toString(petAgeFinal));

            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

