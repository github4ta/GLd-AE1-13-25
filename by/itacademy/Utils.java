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
}
