package de.stromberg.oop.uebung07;
/*
 * @author Simon Stromberg
 * @version 1.0 20200701
 */

public class AtException extends Exception {
    public AtException() {
        System.out.println("At-Zeichen fehlt oder ist mehrmals vorhanden");
    }
}
