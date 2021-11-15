package com.example.apartmentEvaluator.presenter;

import android.util.Patterns;

public class LoginPresenterImpl {


    private LoginView view;
    private int contador = 0;



    public LoginPresenterImpl(LoginView view) {
        this.view = view;
    }

    @Override
    public void validarCuenta(String email, String pass) {

        view.limpiarErrores();
        Boolean estado = true;

        if (email.trim().isEmpty())
        {
            view.correoObligatorio();
            estado = false;
        }
        if(pass.trim().isEmpty())
        {
            view.passwordObligatorio();
            estado = false;
        }
        if (estado)
        {
            if (Patterns.EMAIL_ADDRESS.matcher(email).matches())
            {
                if (pass.equals("123Pass"))
                {
                    view.cambiarDeActivity();
                }
                else
                {
                    contador++;
                    view.mostrarMensajeError();
                    view.limpiarCampos();

                    if (contador == 3)
                    {
                        view.blockearBoton();
                    }
                }
            }
            else
            {
                view.correoObligatorio();
            }

        }
