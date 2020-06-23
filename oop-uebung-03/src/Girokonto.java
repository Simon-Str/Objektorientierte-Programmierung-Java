/**
 *
 *@author Simon Stromberg
 *@version 1.0 20200528
 *
 */

public class Girokonto extends Konto{
    private static double gebuehr=3.0;
    private int anzahlBuchungen;
    private double dispoLimit;




    public Girokonto(String name){
        super(name);
        anzahlBuchungen=0;
        dispoLimit=100.0;

    }

    protected double gebuehren(){
        double temp= gebuehr*anzahlBuchungen;
        if(kontostand-temp>=0) {
            kontostand -= temp;
            anzahlBuchungen = 0;
            return temp;
        }
        else {
            return -1.0;
        }

    }
    @Override
    public void auszahlen(double betrag)
    {
        if(kontostand+dispoLimit >= betrag){
            kontostand=kontostand-betrag;
        }
        else {
            System.out.println("Nicht genügend Guthaben oder Dispo verfügbar");
        }
    }

    @Override
    public boolean ueberweisen(double betrag, Konto zielkonto)
    {
        if(kontostand+dispoLimit<betrag || this.kontonummer==zielkonto.kontonummer || zielkonto==null)
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
