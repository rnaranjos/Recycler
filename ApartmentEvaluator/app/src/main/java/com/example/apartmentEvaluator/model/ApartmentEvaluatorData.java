package com.example.apartmentEvaluator.model;

import java.util.ArrayList;
import java.util.List;

public class ApartmentEvaluatorData {

        public static List<ApartmentEvaluator> apartmentEvaluatorList() {
            List<ApartmentEvaluator> apartmentEvaluatorList = new ArrayList<>();
            ApartmentEvaluator apartment01 = new ApartmentEvaluator("Edificio Almendro","Torre 1", "depto 2002", "san jose 345, La florida , Santiago", "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
            ApartmentEvaluator apartment02 = new ApartmentEvaluator("Edificio Almendro","Torre 1", "depto 2003", "san jose 345, La florida, Santiago", "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
            ApartmentEvaluator apartment03 = new ApartmentEvaluator("Edificio Almendro","Torre 1", "depto 1601", "san jose 345, La florida, Santiago", "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
            ApartmentEvaluator apartment04 = new ApartmentEvaluator("Edificio Alerces","Torre b", "depto 1602", "nueva providencia 1801, Providencia", "https://unsplash.com/photos/PhYq704ffdA/download?force=true&w=640");
            ApartmentEvaluator apartment05 = new ApartmentEvaluator("Edificio Alerces","Torre b", "depto 1801", "nueva providencia 1801, Providencia", "https://unsplash.com/photos/PhYq704ffdA/download?force=true&w=640");
            ApartmentEvaluator apartment06 = new ApartmentEvaluator("Edificio Legado 2","Torre a", "depto 801", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
            ApartmentEvaluator apartment07 = new ApartmentEvaluator("Edificio Legado 2","Torre a", "depto 902", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
            ApartmentEvaluator apartment08 = new ApartmentEvaluator("Edificio Legado 2","Torre a", "depto 909", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
            ApartmentEvaluator apartment09 = new ApartmentEvaluator("Edificio Legado 2","Torre a", "depto 1901", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
            ApartmentEvaluator apartment10 = new ApartmentEvaluator("Condominio nuevo mirador","Torre 1", "depto 102", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
            ApartmentEvaluator apartment11 = new ApartmentEvaluator("Condominio nuevo mirador","Torre 1", "depto 103", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
            ApartmentEvaluator apartment12 = new ApartmentEvaluator("Condominio nuevo mirador","Torre 1", "depto 1501", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
            ApartmentEvaluator apartment13 = new ApartmentEvaluator("Condominio nuevo mirador","Torre 1", "depto 1503", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
            ApartmentEvaluator apartment14 = new ApartmentEvaluator("Condominio nuevo mirador","Torre 2", "depto 2001", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
            ApartmentEvaluator apartment15 = new ApartmentEvaluator("Condominio nuevo mirador","Torre 2", "depto 2201", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
            apartmentEvaluatorList.add(apartment01);
            apartmentEvaluatorList.add(apartment02);
            apartmentEvaluatorList.add(apartment03);
            apartmentEvaluatorList.add(apartment04);
            apartmentEvaluatorList.add(apartment05);
            apartmentEvaluatorList.add(apartment06);
            apartmentEvaluatorList.add(apartment07);
            apartmentEvaluatorList.add(apartment08);
            apartmentEvaluatorList.add(apartment09);
            apartmentEvaluatorList.add(apartment10);
            apartmentEvaluatorList.add(apartment11);
            apartmentEvaluatorList.add(apartment12);
            apartmentEvaluatorList.add(apartment13);
            apartmentEvaluatorList.add(apartment14);
            apartmentEvaluatorList.add(apartment15);
            return apartmentEvaluatorList;
        }
}
