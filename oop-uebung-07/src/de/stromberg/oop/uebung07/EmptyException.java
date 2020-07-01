package de.stromberg.oop.uebung07;
/*
 * @author Simon Stromberg
 * @version 1.0 20200701
 */

public class EmptyException extends Exception {
    public EmptyException() {
        System.out.println("Email-Adresse fehlt komplett");
    }
}
