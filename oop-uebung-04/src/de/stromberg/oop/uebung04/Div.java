/*
 * @author Simon Stromberg
 * @version 1.0 20200610
 */

package de.stromberg.oop.uebung04;

public class Div extends Expr{

    private Expr left;
    private Expr right;

    public Div (Expr l,Expr r){
        this.left=l;
        this.right=r;
    }

    protected double combine(double l, double r){

    }

    protected String oper(){

    }
}
