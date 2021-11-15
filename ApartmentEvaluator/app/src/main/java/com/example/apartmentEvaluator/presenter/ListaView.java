package com.example.apartmentEvaluator.presenter;

import android.os.Bundle;

import com.example.apartmentEvaluator.adapter.ApartmentEvaluatorAdapter;

public interface ListaView {
    void llenarRecycler(ApartmentEvaluatorAdapter.ApartmentEvaluatorAdapter adapter);
    void seleccionarItem(Bundle bundle);
}
