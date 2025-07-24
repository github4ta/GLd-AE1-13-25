package by.itacademy;

import java.util.Random;

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

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String lineInput(String str) {
        return str.substring( 1).toUpperCase();
    }

    public static String getRandomStringByNumber(int length) {
        String str = "qwertyuiopasdfghjk1234567890";
        Random random = new Random();
        String result = "";
        for (int i = 0; i < length; i++) {
            result = result + str.charAt(random.nextInt(str.length()));
        }
        return result;
    }
}
