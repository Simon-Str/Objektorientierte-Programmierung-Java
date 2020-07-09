package de.stromberg.oop.uebung08.verlagsartikel;

/*
 * @author Simon Stromberg
 * @version 1.0 20200709
 */
public class Lehrbuch extends GedrucktesBuch {
    private String thema;

    public Lehrbuch(String pThema, int pSeitenzahl, boolean pIstTaschenbuch){
        thema=pThema;
        super.seitenzahl=pSeitenzahl;
        super.istTaschenbuch=pIstTaschenbuch;
    }

    protected GedrucktesBuch kopieren(){
       return this;
    }

}
