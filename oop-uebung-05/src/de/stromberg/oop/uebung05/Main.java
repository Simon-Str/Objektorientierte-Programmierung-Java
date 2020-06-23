/*
 * @author Simon Stromberg
 * @version 1.0 20200618
 */

package de.stromberg.oop.uebung05;

public class Main {

    public static void main(String[] args) {
        NatZahl ob1 = new NatZahl(12);
        NatZahl1 ob2 = new NatZahl1(21);

//        Integer ob3 = new Integer(10);

        System.out.println(ob1.toString());
        System.out.println(ob1.gt(ob2));
        System.out.println(ob1.eq(ob2));
        System.out.println(ob1.neq(ob2));
        System.out.println(ob1.lt(ob2));
        System.out.println(ob1.ge(ob2));
        System.out.println(ob1.lt(ob2));

        System.out.println(ob2.toString());
        System.out.println(ob2.gt(ob1));
        System.out.println(ob2.eq(ob1));
        System.out.println(ob2.neq(ob1));
        System.out.println(ob2.lt(ob1));
        System.out.println(ob2.ge(ob1));
        System.out.println(ob2.lt(ob1));
    }
}
