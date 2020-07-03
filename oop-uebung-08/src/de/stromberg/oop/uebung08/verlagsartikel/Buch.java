package de.stromberg.oop.uebung08.verlagsartikel;

import java.util.ArrayList;

/*
 * @author Simon Stromberg
 * @version 1.0 20200703
 */

public class Buch {
    private String titel;
    private String sprache;
    private ArrayList <String> autoren=new ArrayList<String>();
    private ArrayList <Buchkapitel> kapitel=new ArrayList<Buchkapitel>();

    public Buch(String pTitel, String pSprache,ArrayList <String> pAutor, ArrayList <Buchkapitel> pKapitel){
        titel=pTitel;
        sprache=pSprache;

        autoren.addAll(pAutor);

        kapitel.addAll(pKapitel);

    }

    public void drucken(){
        System.out.println(titel);
        System.out.println(sprache+System.lineSeparator());

        for(int i=0; i<autoren.size(); i++){
            System.out.println(autoren.get(i));
        }
        System.out.println(System.lineSeparator());

        for(int i=0; i<kapitel.size(); i++){
            System.out.println(kapitel.get(i));
        }
        System.out.println(System.lineSeparator());
    }

    public class Buchkapitel implements Kapitel{
        private int nummer;
        private String kapiteltitel;
        private int seitenzahl;
        
        public Buchkapitel(int pNummer, String pKapiteltitel, int pSeitenzahl){
            nummer=pNummer;
            kapiteltitel=pKapiteltitel;
            seitenzahl=pSeitenzahl;
        }


        @Override
        public int kapitelNummer() {
            return 0;
        }

        @Override
        public String titel() {
            return null;
        }

        @Override
        public int seiten() {
            return 0;
        }
    }

}


