package com.example.apartmentEvaluator.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apartmentEvaluator.MainActivity;
import com.example.apartmentEvaluator.R;
import com.example.apartmentEvaluator.adapter.ProductoAdapter;
import com.example.apartmentEvaluator.databinding.FragmentListaBinding;
import com.example.apartmentEvaluator.databinding.FragmentListaBinding;
import com.example.apartmentEvaluator.model.ProductoModel;
import com.example.apartmentEvaluator.presenter.ListaPresenterImpl;
import com.example.apartmentEvaluator.presenter.ListaView;
import com.example.apartmentEvaluator.presenter.ListaPresenterImpl;
import com.example.apartmentEvaluator.presenter.ListaView;
import com.example.superrepaso.databinding.FragmentListaBinding;

import java.util.ArrayList;


public class ListaFragment extends Fragment implements ListaView {

    private FragmentListaBinding b;
    private ListaPresenterImpl presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        b = FragmentListaBinding.inflate(inflater,container,false);

        presenter = new ListaPresenterImpl(this);
        presenter.generarLista(getContext());

        b.btnVolver.setOnClickListener(v -> {
            Navigation.findNavController(b.getRoot()).navigate(R.id.action_listaFragment_to_agregarFragment);//,bundle);
        });

        return b.getRoot();
    }

    @Override
    public void mostrarLista(RecyclerView.Adapter adapter, RecyclerView.LayoutManager layout) {
        b.rvLista.setLayoutManager(layout);
        b.rvLista.setAdapter(adapter);
    }
}