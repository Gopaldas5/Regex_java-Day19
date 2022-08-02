package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static String firstNameRegex = "^[A-Z][A-Za-z]{2,}$";
    static String lastNameRegex = "^[A-Z][A-Za-z]{2,}$";
    static Pattern pattern;
    static Matcher matcher;

    public static boolean firstName(String firstName){
        pattern = Pattern.compile(firstNameRegex);
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public static boolean lastName(String lastName){
        pattern = Pattern.compile(lastNameRegex);
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("First Name :- "+firstName("Gopal"));
        System.out.println("Last Name :- "+lastName("Das"));
    }

}
