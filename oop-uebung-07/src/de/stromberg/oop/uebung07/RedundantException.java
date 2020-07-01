package de.stromberg.oop.uebung07;
/*
 * @author Simon Stromberg
 * @version 1.0 20200701
 */


public class RedundantException extends Exception {
    public RedundantException() {
        System.out.println("Email-Adresse wurde so schon einmal eingegeben");
    }

}
