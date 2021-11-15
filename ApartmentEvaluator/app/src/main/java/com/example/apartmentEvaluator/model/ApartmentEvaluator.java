package com.example.apartmentEvaluator.model;

public class ApartmentEvaluator {
    private String condominio;  // Nombre del edificio
    private String torre;   // Nombre del Proyecto
    private String departamento;        // Numero de unidad o departamento
    private String direccion;       // Dirección
    private String enlace;  // url de imagen del edificio

    public ApartmentEvaluator(String condominio, String torre, String departamento,
                     String direccion, String enlace) {
        this.condominio = condominio;
        this.torre = torre;
        this.departamento = departamento;
        this.direccion = direccion;
        this.enlace = enlace;
    }

    public String getcondominio() {
        return condominio;
    }

    public void setcondominio(String condominio) {
        this.condominio = condominio;
    }

    public String gettorre() {
        return torre;
    }

    public void settorre(String torre) {
        this.torre = torre;
    }

    public String getdepartamento() {
        return departamento;
    }

    public void setdepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getenlace() {
        return enlace;
    }

    public void setenlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "ApartmentEvaluator{" +
                "condominio='" + condominio + '\'' +
                ", torre='" + torre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", direccion='" + direccion + '\'' +
                ", enlace='" + enlace + '\'' +
                '}';
    }
}
