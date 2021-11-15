package com.example.apartmentEvaluator.presenter;

public interface LoginView {

    void mostrarMensajeError();
    void blockearBoton();
    void limpiarCampos();
    void cambiarDeActivity();
    void correoObligatorio();
    void passwordObligatorio();
    void limpiarErrores();
}
