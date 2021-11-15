package com.example.apartmentEvaluator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apartmentEvaluator.ApartmentEvaluator;

public class MainActivity extends AppCompatActivity {

    public static RegistroApartmentEvaluator lista = new RegistroApartmentEvaluator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}