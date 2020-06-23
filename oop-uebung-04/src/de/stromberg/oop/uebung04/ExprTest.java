
/*
 * @author Simon Stromberg
 * @version 1.0 20200610
 */

package de.stromberg.oop.uebung04;

public class ExprTest {

    public static void main (String [] args) {
        //Ausdruck 2*3+4 erzeugen, ausgeben und berechnen.
        Expr x = new Add(new Mul(new Const (2), new Const (3)), new Const(4));
        System.out.println(x+" = "+x.compute());

        //Ausdruck x mit anderen Ausdrücken und Objeken vergleichen.
        Expr y = new Add(new  Mul (new Const(2), new Const(3)), new Const (4));
        System.out.println(x.equals(y));

        Expr z =  new Add(new Mul(new Const(3), new Const(2)), new Const(4));
        System.out.println(x.equals(z));

        System.out.println(x.equals(x.toString()));
    }

}

