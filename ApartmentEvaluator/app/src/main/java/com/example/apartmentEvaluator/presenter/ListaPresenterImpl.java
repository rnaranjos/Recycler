package com.example.apartmentEvaluator.presenter;

import android.content.Context;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apartmentEvaluator.MainActivity;
import com.example.apartmentEvaluator.adapter.ApartmentEvaluatorAdapter;
import com.example.apartmentEvaluator.adapter.ProductoAdapter;
import com.example.apartmentEvaluator.model.ApartmentEvaluator;
import com.example.apartmentEvaluator.model.ApartmentEvaluatorData;

import java.util.ArrayList;

public class ListaPresenterImpl implements ListaPresenter {

    private ListaView view;

    public ListaPresenterImpl(ListaView view) {
        this.view = view;
    }

    @Override
    public void generarAdapter() {
        ApartmentEvaluatorAdapter adapter = new ApartmentEvaluatorAdapter((ArrayList<ApartmentEvaluator>) ApartmentEvaluatorData.apartmentEvaluatorList());
        view.llenarRecycler(adapter);
    }

    @Override
    public void generarBundle(ApartmentEvaluator apartmentEvaluator) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("apartmentEvaluator",apartmentEvaluator);
        view.seleccionarItem(bundle);
    }
}