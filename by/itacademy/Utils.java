package by.itacademy;

public class Utils {
    public static String generateEmail(String name, String surname) {
        String email = name.toLowerCase() + "." + surname.toLowerCase() + "@gmail.com";
        return email;
    }
}
