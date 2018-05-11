package de.gfn.oca.Adressverwaltung;

/**
 *
 * @author Andreas
 */
public class Adresse {
    private String vorname;
    private String nachname;
    private String strasse;
    private String hausnummer;
    private String plz;
    private String ort;
    private String land;
    
    public Adresse(String vorname, String nachname, String strasse, String hausnummer, String plz, String ort, String land ) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.hausnummer =  hausnummer;
        this.plz = plz;
        this.ort = ort;
        this.land = land;
    }
    
    public Adresse(String vorname, String nachname) {
//        this.vorname = vorname;
//        this.nachname = nachname;
        this(vorname, nachname, "Beispielgasse", "12c", "12345", "Musterstedt", "Deutschland");
    }
    
    public Adresse() {
        super();
    }

    @Override
    public String toString() {
        
        return this.vorname + " " + this.nachname + "\n" + this.strasse + " " + this.hausnummer + "\n" + this.plz + " " + this.ort + "\n" + this.land + "\n";
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setLand(String land) {
        this.land = land;
    }

    
    
}
