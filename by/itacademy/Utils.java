package by.itacademy;

public class Utils {
    public static String capitalLetter(String str) {
        return str.substring(0, 1).toUpperCase();
    }

    public static int getDayFromDate(String date) {
        String str = date.substring(3, 5);
        return Integer.valueOf(str);
    }

    public static String getDate(int day, int month, int year) {
        String stringDay = String.format("%02d", day);
        String stringMonth = String.format("%02d", month);
        String stringYear = String.valueOf(year);
        return stringMonth + "-" + stringDay + "-" +stringYear;
    }
    public static String generateEmail(String name, String surname) {
        String email = name.toLowerCase() + "." + surname.toLowerCase() + "@gmail.com";
        return email;
    }
}
