package de.gfn.oca.Adressverwaltung;

import de.gfn.oca.Adressverwaltung.helper.AdrHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Andreas
 */
public class Adressverwaltung {
    
    private static List<Adresse> adressen = new ArrayList<>();

    
    public static void main(String[] args) {
        
        Adressverwaltung adr = new Adressverwaltung();
        
        Scanner scanner = new Scanner(System.in);
        
        boolean exit = false;
        
        while(!exit) {
            adr.adressen.add(AdrHelper.setByInput(new Adresse(), scanner));

            
            System.out.println("Wollen Sie eine weitere Adresse eingeben (j oder n)?");
            
//            Funktioniert so, weil der switch-case, str1.equals(str2) benutzt
//            switch(scanner.next().toUpperCase()) {
//                
//                case "N": exit = true;
//                          System.out.println("Anzahl der eingegebenen Adress-Sätze: " + AdrHelper.getAnzahl_adressen() + "\n");
//                          break;
//            }

//            if (scanner.next().toUpperCase() == "N")
//            Funktioniert so nicht, warum? 
//            "==" vergleicht nur die Referenzen, aber nicht die Inhalte! 

//          Mit "equalsIgnoreCase" funktioniert es prächtig!
            if (scanner.next().toUpperCase().equalsIgnoreCase("N")) {
                exit = true;
                System.out.println("Anzahl der eingegebenen Adress-Sätze: " + AdrHelper.getAnzahl_adressen() + "\n");
            }
            else System.out.println("Weiter geht's mit der Eingabe");
            
        }
        
        // enhanced for-loop für die Ausgabe der eingebenen Adress-Datensätze
        for(Adresse a : adressen) {
            System.out.println(a.toString());
        }
    }
    
}
