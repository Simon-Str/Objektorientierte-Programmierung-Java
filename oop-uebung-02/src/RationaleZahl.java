/**
 *
 * @author Simon Stromberg
 * @version 1.0 20202519
 */

public class RationaleZahl {
    private int zaehler;
    private int nenner;
    private double kommawert;
    private int ggT;


    public RationaleZahl(int z, int n){
        this.zaehler=z;
        this.nenner=n;
//        if (n>0){
            this.kommawert= (double) z/ (double) n;
//        }
    }

    public void alsBruchAusdrucken(){
        System.out.println(zaehler+"/"+nenner);
    }

    public void alsKommawertAusgeben(){
        System.out.println(kommawert);
    }

    public RationaleZahl kehrwert() {
        return new RationaleZahl(nenner,zaehler);
    }

    private int ggTBerechnen(){
        int m=zaehler;
        int n=nenner;
        int r;

        while(m>0) {
            r= n%m;
            n=m;
            m=r;
        }
        ggT=n;
        return n;

    }

    public boolean kuerzen (){
        int l_ggT;
        l_ggT= ggTBerechnen();
        if(l_ggT != 1 && l_ggT != 0) {
            zaehler = zaehler / l_ggT;
            nenner = nenner / l_ggT;
            return true;
        }
        else{
            return false;
        }
    }

    public RationaleZahl gekuerzt (){
        int n;
        int z;
        if(ggT == 0){
            ggTBerechnen();
        }
        n= nenner/ggT;
        z= zaehler/ggT;
        return new RationaleZahl(z,n);
    }

    public RationaleZahl ungekuerzt (){
        int n=nenner;
        int z=zaehler;

        if(ggT!= 0) {
            n = nenner * ggT;
            z = zaehler * ggT;
        }

        return new RationaleZahl(z,n);
    }






}
