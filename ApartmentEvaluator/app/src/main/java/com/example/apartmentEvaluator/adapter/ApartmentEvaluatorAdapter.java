package com.example.apartmentEvaluator.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apartmentEvaluator.R;
import com.example.apartmentEvaluator.databinding.ItemLayoutBinding;
import com.example.apartmentEvaluator.model.ApartmentEvaluator;
import com.example.superrepaso.R;
import com.example.superrepaso.databinding.ItemLayoutBinding;

import java.util.ArrayList;

    public class ApartmentEvaluatorAdapter extends RecyclerView.Adapter<ApartmentEvaluatorAdapter.CustomViewHolder> {

    private ArrayList<ApartmentEvaluator> lista;
    private View.OnClickListener listener;

    public ApartmentEvaluatorAdapter(ArrayList<ApartmentEvaluator> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.bindData(lista.get(position));
    }

    @Override
    public int getItemCount() {

        return lista.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{

        private ItemLayoutBinding bining;
        private View.OnClickListener

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            bining = ItemLayoutBinding.bind(itemView);
            this.listener = listener;
        }

        public void bindData(ApartmentEvaluator apartmentEvaluator)
        {
            bining.tvCondominio.setText(apartmentEvaluator.getCondominio());
            bining.tvTorre.setText(apartmentEvaluator.getTorre());
            bining.tvDepartamento.setText(apartmentEvaluator.getDepartamento());
            bining.tvDireccion.setText(apartmentEvaluator.getDireccion());
            bining.tvEnlace.setText(apartmentEvaluator.getEnlace());
            itemView.setOnClickListener(v -> {
                listener.onApartmentEvaluatorClick(apartmentEvaluator);
            });
        }
    }

    public interface OnClickListener{
        void onApartmentEvaluatorClick(ApartmentEvaluator apartmentEvaluator);
    }

    public void setListener(OnClickListener listener) {
        this.listener = listener;

    }
}
