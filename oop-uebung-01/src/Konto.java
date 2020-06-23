
/**
 * Beschreiben Sie hier die Klasse Konto.
 * 
 * @author Simon Stromberg
 * @version 1.0 20200513
 */
public class Konto
{
private int kontonummer;
private String inhaberIn;
private double kontostand;


    /**
     * Konstruktor für Objekte der Klasse Konto
     */
    public Konto(String name)
    {
        inhaberIn=name;
        kontonummer=KontoMain.laufnr;
        KontoMain.laufnr++;
        kontostand=500;
    }

    /**
     * Methode, um auf dem Konto einen Betrag einzuzahlen
     * 
     * @param  betrag   Der Betrag, der auf das Konto eingezahlt werden soll
     */
    public void einzahlen(double betrag)
    {
        kontostand= kontostand+betrag;
    }

    /**
     * Methode, um von dem Konto einen Betrag auszuzahlen
     * 
     * @param  betrag   Der Betrag, der von dem Konto ausgezahlt werden soll
     */
    public void auszahlen(double betrag)
    {
        if(kontostand >= betrag){
            kontostand=kontostand-betrag;
        }
        else {
            System.out.println("Nicht genügend Guthaben verfügbar");
        }
    }
    
    /**
     * Methode, um die Kontodaten am Bildschirm auszugeben
     */
    public void ausgabe()
    {
        System.out.println("Kontonummer: "+kontonummer);
        System.out.println("Inhaber/-in: "+ inhaberIn);
        System.out.println("Kontostand: " + kontostand);
    }
    
    /**
     * Methode, um einen Betrag vom aktuellen Konto auf ein anderes zu überweisen
     * 
     * @param  betrag       Der Betrag, der transferiert werden soll
     * @param  zielkonto    Das Konto, auf das der Betrag transferiert werden soll
     * 
     * @return true, wenn Transfervoraussetzungen erfüllt sind (siehe Übungsblatt), andernfalls false
     */
    public boolean ueberweisen(double betrag, Konto zielkonto)
    {
        if(kontostand<betrag || this.kontonummer==zielkonto.kontonummer || zielkonto==null)
        {
            System.out.println("Fehler bei der Überweisung. Krücke!");
            return false;
        }
        else{
            kontostand=kontostand-betrag;
            zielkonto.einzahlen(betrag);
            System.out.println(betrag+"Euro wurden überwiesen.");
            return true;
        }
    }    
}
