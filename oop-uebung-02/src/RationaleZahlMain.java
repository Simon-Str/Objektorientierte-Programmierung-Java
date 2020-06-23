
/*
 *  @author Simon Stromberg
 *  @version 1.0 20200520
 */

public class RationaleZahlMain {

    public static void main(String[] args)
    {
        RationaleZahl bruch1 = new RationaleZahl(6,12);

        System.out.println("Bruch1:");
        bruch1.alsBruchAusdrucken();
        bruch1.alsKommawertAusgeben();
        System.out.println(" ");

        RationaleZahl gekuerzt=bruch1.gekuerzt();
        bruch1.kuerzen();
        RationaleZahl ungekuerzt=bruch1.ungekuerzt();
        RationaleZahl kehrwert=bruch1.kehrwert();

        System.out.println("Gekuerzt: ");
        gekuerzt.alsBruchAusdrucken();
        gekuerzt.alsKommawertAusgeben();
        System.out.println(" ");

        System.out.println("Ungekuerzt: ");
        ungekuerzt.alsBruchAusdrucken();
        ungekuerzt.alsKommawertAusgeben();
        System.out.println(" ");

        System.out.println("Kehrwert: ");
        kehrwert.alsBruchAusdrucken();
        kehrwert.alsKommawertAusgeben();





    }

}
