package by.itacademy;

public class Assertions {

    public static boolean assertEquals(int expected, int actual) {
        boolean result = expected == actual;
        if (!result) {
            System.out.printf("ERROR: ожидаем %s, но фактически %s", expected, actual);
            // String str = String.format("ERROR: ожидаем %s, но фактически %s", EXPECTED_SUM, actualSum);
        }
        return result;
    }
}
