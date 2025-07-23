package by.itacademy;

import java.util.Random;

public class Utils {

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
