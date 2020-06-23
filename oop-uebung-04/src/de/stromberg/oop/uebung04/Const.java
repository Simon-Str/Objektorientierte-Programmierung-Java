/*
 * @author Simon Stromberg
 * @version 1.0 20200610
 */

package de.stromberg.oop.uebung04;

public class Const extends Expr{
    private double value;

    public Const (double v){
        this.value=v;
    }

    @Override
    double compute() {
        return value;
    }

}
