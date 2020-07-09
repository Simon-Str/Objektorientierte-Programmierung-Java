package de.stromberg.oop.uebung08.verlagsartikel;

/*
 * @author Simon Stromberg
 * @version 1.0 20200709
 */
public abstract class EBook {
    protected int dateigroesse;
    protected String dateiformat;

    public EBook(int pDateigroesse, String pDateiformat){
        dateigroesse=pDateigroesse;
        dateiformat=pDateiformat;
    }

    protected abstract void speichern();

}
