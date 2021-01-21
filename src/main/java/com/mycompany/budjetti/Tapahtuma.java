package com.mycompany.budjetti;

public class Tapahtuma {

    private String kategoria;
    private double lasku;
    private String muistiinpano;

    public Tapahtuma(String kategoria, double lasku, String muistiinpano) {
        this.kategoria = kategoria;
        this.lasku = lasku;
        this.muistiinpano = muistiinpano;
    }

    public String toString() {
        return this.kategoria + "," + this.lasku + "," + this.muistiinpano;
    }
}
