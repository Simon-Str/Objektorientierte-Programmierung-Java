package de.stromberg.oop.uebung08.verlagsartikel;

/*
 * @author Simon Stromberg
 * @version 1.0 20200709
 */
public class Betriebsanleitung extends EBook{
    private boolean istGespeichert;

    public Betriebsanleitung(int pDateigroesse, String pDateiformat, String pIstGespeichert){
        istGespeichert=pIstGespeichert;
        super.dateigroesse=pDateigroesse;
        super.dateiformat=pDateiformat;
    }

    protected void speichern(){
        istGespeichert=true;
    }
}
