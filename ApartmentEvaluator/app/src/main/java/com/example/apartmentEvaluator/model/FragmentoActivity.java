package com.example.apartmentEvaluator.model;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.superrepaso.databinding.ActivityFragmentoBinding;

public class FragmentoActivity extends AppCompatActivity {

    private ActivityFragmentoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFragmentoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}