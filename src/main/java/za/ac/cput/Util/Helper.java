package za.ac.cput.Util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper
{
    public static boolean isNullorEmpty(String s){
        return (s == null || s.equals("") || s.isEmpty() || s.equalsIgnoreCase("null"));

    }

    public static boolean isValidEmail(String email){
        EmailValidator ev = EmailValidator.getInstance();
        return ev.isValid(email);
    }

    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}