package by.itacademy;

public class Utils {
        public static int getDayFromDate(String date) {
          String str = date.substring(3, 5);
          return Integer.valueOf(str);
        }
}
