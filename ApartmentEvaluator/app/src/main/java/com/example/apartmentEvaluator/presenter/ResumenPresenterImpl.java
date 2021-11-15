package com.example.apartmentEvaluator.presenter;

import android.os.Bundle;

public class ResumenPresenterImpl {

    private ResumenView view;
    private ApartmentEvaluator apartmentEvaluator;
    private int puntaje;

    public ResumenPresenterImpl(ResumenView view) {
        this.view = view;
    }

    @Override
    public void obtenerApartmentEvaluator(Bundle bundle) {
        apartmentEvaluator = (ApartmentEvaluator) bundle.getSerializable("apartmentEvaluator");
        view.llenarViews(apartmentEvaluator.getBuildingName(),apartmentEvaluator.getUnitId(),apartmentEvaluator.getUrlImageBuilding());
    }

    @Override
    public void calcularPuntaje() {
        puntaje = 0;
        if (view.isLucesChecked())
        {
            puntaje += 10;
        }
        if (view.isDormitorioChecked())
        {
            puntaje += 20;
        }
        if(view.isCocinaChecked())
        {
            puntaje += 30;
        }
        if (view.isBanioChecked())
        {
            puntaje += 40;
        }
        switch(view.getRadioPosition())
        {
            case 0: puntaje *= 3; break;
            case 1: puntaje *= 2; break;
        }
        view.mostrarPuntaje(String.valueOf(puntaje));

        if (puntaje < 130)
        {
            view.activarBoton();
        }
    }

    @Override
    public void generarAlerta() {
        view.enviarMail(apartmentEvaluator.getBuildingName(),apartmentEvaluator.getUnitId(),puntaje);
    }


    public ApartmentEvaluator.getApartmentEvaluator() {
        return apartmentEvaluator;
    }

    public int getPuntaje() {
        return puntaje;
    }
}
