package de.stromberg.oop.uebung08.verlagsartikel;

/*
 * @author Simon Stromberg
 * @version 1.0 20200709
 */
public abstract class GedrucktesBuch extends Buch{
    protected int seitenzahl;
    protected boolean istTaschenbuch;

    public GedrucktesBuch(int pSeitenzahl, boolean pIstTaschenbuch){
        seitenzahl=pSeitenzahl;
        istTaschenbuch=pIstTaschenbuch;
    }

    protected abstract void kopieren();
}
