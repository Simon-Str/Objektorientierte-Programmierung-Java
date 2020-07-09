package de.stromberg.oop.uebung08.verlagsartikel;

/*
 * @author Simon Stromberg
 * @version 1.0 20200703
 */

public class Main {

    public static void main(String[] args) {
        Buch array[]= new Buch [4];

            Lehrbuch lehrbuch1 = new Lehrbuch("Mechanik", 100, true);
            Betriebsanleitung betriebsanleitung1 = new Betriebsanleitung(10,"pdf",false);
            GedrucktesBuch gedrucktesBuch1 = new GedrucktesBuch(50,false);
            EBook eBook1 = new EBook (20, ".book");

            array[0]=lehrbuch1;
            array[1]=betriebsanleitung1;
            array[2]=gedrucktesBuch1;
            array[3]=eBook1;

        for (int i=0; i< array.length();i++){

        }
    }
}
