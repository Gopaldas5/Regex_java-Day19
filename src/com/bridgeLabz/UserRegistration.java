package com.bridgeLabz;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static String firstNameRegex = "^[A-Z][A-Za-z]{2,}$";
    static String lastNameRegex = "^[A-Z][A-Za-z]{2,}$";
    static String emailRegex = "^([a-zA-Z\\.]+)([a-zA-Z0-9\\.\\-+]+)@([a-zA-Z0-9\\._]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$";
    static String mobileNumberRegex = "^(\\+[0-9]{1,3}[- ]?)?[0-9]{10}$";
   // static String passwordRegex = "^[A-Za-z]{8,}$";

    //Minimum eight characters, at least one uppercase letter, one lowercase letter and one number
   // static String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";  //--> \\d = 0-9

  // Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character
    static String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
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
    public static boolean email(String email){
        pattern = Pattern.compile(emailRegex);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean mobileNumber(String mobileNumber){
        pattern = Pattern.compile(mobileNumberRegex);
        matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }
    public static boolean password(String password){
        pattern = Pattern.compile(passwordRegex);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("First Name :- "+firstName("Gopal"));
        System.out.println("Last Name :- "+lastName("Das"));

        System.out.println("Email :- "+email("gopalkda.1997@gmail.com"));
        System.out.println("Email :- "+email("abc@yahoo.com"));
        System.out.println("Email :- "+email("abc-100@yahoo.com"));
        System.out.println("Email :- "+email("abc.100@yahoo.com"));
        System.out.println("Email :- "+email("abc111@abc.com"));
        System.out.println("Email :- "+email("abc@gmail.com.com"));
        System.out.println("Email :- "+email("abc+100@gmail.com"));
        System.out.println("Email :- "+email("abc@1.com"));
        System.out.println("Email :- "+email("abc.100@abc.com.au"));

        System.out.println("Mobile Number :- "+mobileNumber("+91 8757538752"));
        System.out.println("Password :- "+password("G@343u873"));
    }


}
