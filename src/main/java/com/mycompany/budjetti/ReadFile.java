package com.mycompany.budjetti;

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
        Tunnistetiedot käyttäjä = new Tunnistetiedot(tunnus, salasana);
        String syötö = käyttäjä.toString();

        addLista(txt);
        /*
        ArrayList<String> rivit = new ArrayList<>();
        try (Scanner tiedostonLukija = new Scanner(Paths.get(txt))) {
            while (tiedostonLukija.hasNextLine()) {
                rivit.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
         */
        for (String jono : this.rivit) {
            if (syötö.equals(jono)) {
                return true;
            }
        }
        return false;

    }

    public String readTapahtuma(String txt, String kategoria) {

        addLista(txt);
        /*
        ArrayList<String> rivit = new ArrayList<>();
        try (Scanner tiedostonLukija = new Scanner(Paths.get(txt))) {
            while (tiedostonLukija.hasNextLine()) {
                rivit.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }*/
        // с этой часть. все записывает

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
        addLista(txt);

        String tulo = "";
        for (String tulosta : this.rivit) {
            tulo = tulo + " " + tulosta + "\n";
        }
        return tulo;
    }

    public double summa(String txt, String kategoria) {
        addLista(txt);

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

    public double summaKaikkien(String txt) {
        addLista(txt);

        double rahaKaikkien = 0.0;
        for (String jono : this.rivit) {
            String[] palat = jono.split(",");
            rahaKaikkien += Double.valueOf(palat[1]);
        }
        return rahaKaikkien;
    }

    public void addLista(String txt) {

        try (Scanner tiedostonLukija = new Scanner(Paths.get(txt))) {
            while (tiedostonLukija.hasNextLine()) {
                this.rivit.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
    }

    public static void lisaaMerkkijono(String merkkijono, String new_path) {
        try {
            Write line = new Write(new_path, true);
            line.fileWrite(merkkijono);
        } catch (IOException a) {
            System.out.println(a.getMessage());
        }
    }
}
