package com.example.apartmentEvaluator.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.superrepaso.R;
import com.example.superrepaso.adapter.ApartmentAdapter;
import com.example.superrepaso.databinding.FragmentListaBinding;
import com.example.superrepaso.presenter.ListaPresenterImpl;
import com.example.superrepaso.presenter.ListaView;


public class ListaFragment extends Fragment implements ListaView {

    private FragmentListaBinding binding;
    private ListaPresenterImpl presenter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentListaBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        presenter = new ListaPresenterImpl(this);
        presenter.generarAdapter();
    }

    @Override
    public void llenarRecycler(ApartmentAdapter adapter) {
        binding.rvLista.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rvLista.setAdapter(adapter);

        adapter.setListener(apartment -> {
            presenter.generarBundle(apartment);
        });

    }

    @Override
    public void seleccionarItem(Bundle bundle) {
        Navigation.findNavController(getView()).navigate(R.id.action_listaFragment_to_resumenFragment,bundle);
    }
}