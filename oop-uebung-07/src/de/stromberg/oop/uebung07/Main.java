package de.stromberg.oop.uebung07;

import java.util.ArrayList;

/*
 * @author Simon Stromberg
 * @version 1.0 20200701
 */
public class Main {

    public static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {

        try {
            System.out.println(pruefeEmail("test.ab@hs-aalen.de"));
            System.out.println(pruefeEmail("test.ab@hs-aalen.de"));
            System.out.println(pruefeEmail("testataalen.de"));
            System.out.println(pruefeEmail("student@test@aalen.de"));
            System.out.println(pruefeEmail("stu@dent@test@aalen.de"));
        } catch (RedundantException e) {
            e.printStackTrace();
        }


    }

    public static String pruefeEmail(String email) throws RedundantException {
        try {

            if (list.contains(email) == false) {
                list.add(email);
            } else {
                throw new RedundantException();
            }

            if (email == null || email.equals("")) {
                email = "name@hs-aalen.de";
                throw new EmptyException();
            } else if (email.indexOf("@") == 0) {
                email = "name" + email;
                throw new PrefixException();
            } else if (email.indexOf("@") == email.length()) {
                email += "hs-aalen.de";
                throw new DomainException();
            } else {
                int count = 0;
                int lastAt = -100;
                for (int i = 0; i < email.length(); i++) {
                    if (email.charAt(i) == '@') {
                        count++;
                        lastAt = i;
                    }
                }
                if (count == 0) {
                    email += "@hs-aalen.de";
                    throw new AtException();
                } else if (count > 1) {
                    String emailNew = email.replace("@", "");
                    emailNew = emailNew.substring(0, lastAt - (count - 1)) + "@" + emailNew.substring(lastAt - (count - 1), emailNew.length());
                    email = emailNew;
                    throw new AtException();
                }
            }

        } catch (EmptyException | RedundantException | PrefixException | DomainException | AtException e) {
            e.printStackTrace();

        }
        return email;
    }
}
