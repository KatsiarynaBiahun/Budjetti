package com.mycompany.budjetti;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public ReadFile() {

    }

    public static boolean read(String tunnus, String salasana) {
        Tunnistetiedot käyttäjä = new Tunnistetiedot(tunnus, salasana);
        String syötö = käyttäjä.toString();

        ArrayList<String> rivit = new ArrayList<>();
        try (Scanner tiedostonLukija = new Scanner(Paths.get("tiedot.txt"))) {
            while (tiedostonLukija.hasNextLine()) {
                rivit.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        for (String jono : rivit) {
            if (syötö.equals(jono)) {
                return true;
            }
        }
        return false;
        
    }

    public static void lisaaMerkkijono(String merkkijono) { //throws IOException

        String new_path = "C:\\Users\\94630\\OneDrive\\Tiedostot\\NetBeansProjects\\Budjetti\\tiedot.txt";

        try {
            Write line = new Write(new_path, true);
            line.fileWrite(merkkijono);
        } catch (IOException a) {
            System.out.println(a.getMessage());
        }
    }

}
