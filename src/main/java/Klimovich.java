import org.apache.commons.lang.RandomStringUtils;

public class Klimovich {

    public static String generateString(int length) {
        String generateString = RandomStringUtils.randomAlphabetic(length);
        return generateString;
    }
}
