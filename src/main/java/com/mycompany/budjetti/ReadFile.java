package com.mycompany.budjetti;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    private ArrayList<String> rivit;

    public ReadFile() {
        this.rivit = new ArrayList<>();
    }

    public boolean read(String tunnus, String salasana, String txt) {
        //käyttäjätiedot, jotka on syötetty juuri niin luetaan oikessa muodossa Tunnistetiedot -luokan avulla
        Tunnistetiedot käyttäjä = new Tunnistetiedot(tunnus, salasana);
        String syötö = käyttäjä.toString();

        //lisätään kaikki rivit txt -tiedostosta ArrayListaan  
        addLista(txt);
        //verrataan ArrayListan jokaisen rivi syötöön 
        for (String jono : this.rivit) {
            if (syötö.equals(jono)) {
                return true;
            }
        }
        return false;
    }

     public static void saveToFile(String text, char[] pass, String txt) {
         //lisätään tunnus ja salasana txt-tiedostoon
        StringBuilder SS = new StringBuilder("");
        for (char ch : pass) {
            SS = SS.append(ch);
        }

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(txt, true));
            writer.append(text + "," + SS);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
    public String readTapahtuma(String txt, String kategoria) {
        // luetaan vallitun kategorian tapahtumat this.rivit listasta jotta ne ilmestyy JTableen
        ArrayList<String> kategoriaOnLista = new ArrayList<>();
        for (String jono : this.rivit) {
            String[] palat = jono.split(",");
            String nimi = palat[0];
            if (kategoria.equals(nimi)) {
                kategoriaOnLista.add(jono);
            }
        }
        String kategoriaTulosta = "";
        for (String tulosta : kategoriaOnLista) {
            kategoriaTulosta = kategoriaTulosta + " " + tulosta + "\n";
        }
        return kategoriaTulosta;
    }

    public String readKaikkiTapahtumat(String txt) {
        // luetaan this.rivit listasta kaikki tapahtumat jotta ne ilmestyy JTableen
        String tulo = "";
        for (String tulosta : this.rivit) {
            tulo = tulo + " " + tulosta + "\n";
        }
        return tulo;
    }

    public double summa(String txt, String kategoria) {
        //valittujen kategorian tapahtumien summa 
        ArrayList<String> kategoriaOnLista = new ArrayList<>();
        for (String jono : this.rivit) {
            String[] palat = jono.split(",");
            String nimi = palat[0];
            if (kategoria.equals(nimi)) {
                kategoriaOnLista.add(jono);
            }
        }

        double raha = 0;
        for (String summa : kategoriaOnLista) {
            String[] palat = summa.split(",");
            raha += Double.valueOf(palat[1]);
        }
        return raha;
    }

    public void addLista(String txt) {
        // lisätään kaikki tapahtumat txt-tiedostosta this.rivit -listaan; 
        // suoritetaan kun Ohjelma -luokka avataan
        try (Scanner tiedostonLukija = new Scanner(Paths.get(txt))) {
            while (tiedostonLukija.hasNextLine()) {
                this.rivit.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

    }

    public static void lisaaMerkkijono(String merkkijono, String new_path) {
        //lisätään merkijonoa txt-tiedostoon
        try {
            Write line = new Write(new_path, true);
            line.fileWrite(merkkijono);
        } catch (IOException a) {
            System.out.println(a.getMessage());
        }
    }

    public void addMerkkijono(String merkkijono) {
        //lisätään vain yhden uuden tapahtuman this.rivit -listaan
        this.rivit.add(merkkijono);
    }

}
