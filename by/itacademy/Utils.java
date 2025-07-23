package by.itacademy;

public class Utils {
    public static String capitalLetter(String str) {
        return str.substring(0, 1).toUpperCase();
    }
        public static int getDayFromDate(String date) {
          String str = date.substring(3, 5);
          return Integer.valueOf(str);
        }
}
