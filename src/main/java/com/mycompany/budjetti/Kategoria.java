package com.mycompany.budjetti;

import java.util.ArrayList;

public class Kategoria {

    private ArrayList<Tapahtuma> tapahtuma;
    private double summa;

    public Kategoria() {
        this.tapahtuma = new ArrayList<>();
        this.summa = 0;
    }

    public void lisaa(Tapahtuma tapahtuma) {
        this.tapahtuma.add(tapahtuma);
    } 

    //dont work
    public double summa() {
        for (Tapahtuma numero : tapahtuma) {
            this.summa += numero.getLasku();
        }
        return this.summa;
    }

    //dont work
    public String tulosta() {
        String merkkijono = "";
        for (Tapahtuma numero : tapahtuma) {
            merkkijono = merkkijono + " " + numero.toString() + "\n";
        }
        return merkkijono;
       
    }

    //dont work
    public String toString() {
        return  ": " + this.summa;
    }

}
