/*
 * @author Simon Stromberg
 * @version 1.0 20200610
 */

package de.stromberg.oop.uebung04;

public class Add extends Expr{
    private Expr left;
    private Expr right;
    private double added;

    public Add (Expr l,Expr r){
        this.left=l;
        this.right=r;
        combine(l.compute,r.compute);
    }

    protected double combine(double l, double r){

    }

    protected String oper(){

    }
}
