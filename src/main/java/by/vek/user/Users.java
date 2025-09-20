package by.vek.user;

import by.vek.utils.Utils;

import java.util.Random;

public class Users {

    private static final String GMAIL_PATTERN = "%s.%s@gmail.com";
    private static final int MIN_LENGTH = 3;
    private static final int MAX_LENGTH = 10;
    private static final Random RANDOM = new Random();

    private static String generateRandomStringWithRandomLength() {
        int length = RANDOM.nextInt(MIN_LENGTH, MAX_LENGTH + 1);

        return Utils.generateString(length);
    }

    public static String generateEmail() {
        String firstPart = generateRandomStringWithRandomLength();
        String secondPart = generateRandomStringWithRandomLength();

        return String.format(GMAIL_PATTERN, firstPart, secondPart);
    }
}
