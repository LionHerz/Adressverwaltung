package de.gfn.oca.Adressverwaltung.helper;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import de.gfn.oca.Adressverwaltung.Adresse;

/**
 *
 * @author Andreas
 */
public class AdrHelper {
    
    public final static String DATE_FORMAT = "dd.MM.yyyy";
    public final static  DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
    static int anzahl_adressen;

    public static Adresse setByInput(Adresse adresse, Scanner scanner) {
        
            System.out.print("Vorname: ");
            adresse.setVorname(scanner.next());
            System.out.print("Nachname: ");
            adresse.setNachname(scanner.next());
            System.out.print("Strasse: ");
            adresse.setStrasse(scanner.next());
            System.out.print("Hausnummer: ");
            adresse.setHausnummer(scanner.next());
            System.out.print("PLZ: ");
            adresse.setPlz(scanner.next());
            System.out.print("Ort: ");
            adresse.setOrt(scanner.next());
            System.out.print("Land: ");
            adresse.setLand(scanner.next());
            
            anzahl_adressen++;

        return adresse;
    }

    public static int getAnzahl_adressen() {
        return anzahl_adressen;
    }
    
    
}
