package com.mycompany.budjetti;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tunnistetiedot {

    private String käyttäjätunnus;
    private String salasana;

    public Tunnistetiedot(String tunnus, String salasana) {
        this.käyttäjätunnus = tunnus;
        this.salasana = salasana;
    }
    

    public boolean equals(Tunnistetiedot verrattava) {

        if (!(verrattava instanceof Tunnistetiedot)) {
            return false;
        }

        Tunnistetiedot verrattavaHenkilo = (Tunnistetiedot) verrattava;

        if (this.käyttäjätunnus.equals(verrattavaHenkilo.käyttäjätunnus)
                && this.salasana.equals(verrattavaHenkilo.salasana)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.käyttäjätunnus + "," + this.salasana;
    }
}
