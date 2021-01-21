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
    
    public String toString() {
        return this.käyttäjätunnus + "," + this.salasana;
    }
}
