package com.mycompany.budjetti;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    private static ArrayList<String> rivit = new ArrayList<>();

    public ReadFile() {

    }

    public static boolean read(String tunnus, String salasana, String txt) {
        Tunnistetiedot käyttäjä = new Tunnistetiedot(tunnus, salasana);
        String syötö = käyttäjä.toString();

        addLista(txt);
        /* ArrayList<String> rivit = new ArrayList<>();
        try (Scanner tiedostonLukija = new Scanner(Paths.get(txt))) {
            while (tiedostonLukija.hasNextLine()) {
                rivit.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
         */
        for (String jono : rivit) {
            if (syötö.equals(jono)) {
                return true;
            }
        }
        return false;

    }

    public static String readTapahtuma(String txt, String kategoria) {

        //addLista(txt);

        ArrayList<String> rivit = new ArrayList<>();
        try (Scanner tiedostonLukija = new Scanner(Paths.get(txt))) {
            while (tiedostonLukija.hasNextLine()) {
                rivit.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        // с этой часть. все записывает
        ArrayList<String> kategoriaOnLista = new ArrayList<>();
        for (String jono : rivit) {
            String[] palat = jono.split(",");
            String nimi = palat[0];
            if (kategoria.equals(nimi)) {
                kategoriaOnLista.add(jono);
            }
        }
        String kategoriaTulosta = "";
        for (String tulosta : kategoriaOnLista) {
            kategoriaTulosta += tulosta;
        }
        return kategoriaTulosta;
    }

    public static void addLista(String txt) {

        try (Scanner tiedostonLukija = new Scanner(Paths.get(txt))) {
            while (tiedostonLukija.hasNextLine()) {
                rivit.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

    }

    public static void lisaaMerkkijono(String merkkijono, String new_path) { //throws IOException

        try {
            Write line = new Write(new_path, true);
            line.fileWrite(merkkijono);
        } catch (IOException a) {
            System.out.println(a.getMessage());
        }
    }

}
