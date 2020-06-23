/**
 *@author Simon Stromberg
 *@version 1.0 20200528
 */

public class Jugendkonto extends Konto {
    private int alter;



    public Jugendkonto (String name , int alter){
       super(name);
       this.alter=alter;
    }

    protected double neuesAlter (double alter){
       if(alter<21){
           kontostand+=100;
       }
       if(alter<=this.alter){
           System.out.println("Fehler!");
       }
       return kontostand;
    }
}
