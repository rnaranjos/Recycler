package com.example.apartmentEvaluator.presenter;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.apartmentEvaluator.model.FragmentoActivity;
import com.example.superrepaso.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements LoginView {

    private ActivityMainBinding binding;
    private LoginPresenterImpl presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = new LoginPresenterImpl(this);


        binding.btnIngresar.setOnClickListener(v -> {
            String email = binding.edEmail.getEditText().getText().toString();
            String pass = binding.edPass.getEditText().getText().toString();

            presenter.validarCuenta(email, pass);
        });
    }

    @Override
    public void mostrarMensajeError() {

        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle(getString(R.string.error));
        alerta.setMessage(getString(R.string.alerta_msg));
        alerta.setNeutralButton(getString(R.string.ok), (dialog, which) -> {
            dialog.cancel();
        });
        alerta.show();
    }

    @Override
    public void blockearBoton() {
        binding.btnIngresar.setEnabled(false);

    }

    @Override
    public void limpiarCampos() {
        binding.edEmail.getEditText().getText().clear();
        binding.edPass.getEditText().getText().clear();

    }

    @Override
    public void cambiarDeActivity() {
        Intent intento = new Intent(this, FragmentoActivity.class);
        startActivity(intento);
    }

    @Override
    public void correoObligatorio() {
        binding.edEmail.setError(getString(R.string.email_error));
    }

    @Override
    public void passwordObligatorio() {
        binding.edPass.setError(getString(R.string.pass_error));
    }

    @Override
    public void limpiarErrores() {
        binding.edPass.setError("");
        binding.edEmail.setError("");
    }
}