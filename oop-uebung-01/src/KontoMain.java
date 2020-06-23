
/**
 * Vorlage für Übung 1 OOP WS 2017
 * 
 * @author Simon Stromberg
 * @version 1.0 20200513
 */
public class KontoMain
{
    /**
     * Hauptfunktion / Hauptmethode / Programmeinstieg
     * 
     * @param  args Die Kommandozeilen-Argumente
     */
    public static int laufnr;

    public static void main(String[] args)
    {
        laufnr=1000;
        Konto konto1 = new Konto("Hugo");
        Konto konto2 = new Konto("Hugeline");
        konto1.einzahlen(1000.0);
        konto2.einzahlen(2000.0);
        konto2.ueberweisen(1000.0, konto1);
        konto2.ueberweisen(2000.0, konto1);
        konto2.ueberweisen(2000.0, konto2);
        konto1.ausgabe();
        konto2.ausgabe();
        konto1.auszahlen(200.5);
        konto2.auszahlen(1500);
        konto1.ausgabe();
        konto2.ausgabe();
        konto2.einzahlen(1303);
        konto2.auszahlen(1500);
        konto1.ausgabe();
        konto2.ausgabe();
    }
}
