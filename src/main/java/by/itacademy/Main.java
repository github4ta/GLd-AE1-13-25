package by.itacademy;

public class Main {

    public static void main(String[] args) {
        // 1. подготовка
        Calculator calculator = new Calculator();
        // исходные (тестовые) данные, ожидаемый результат - из документации
        int a = 2;
        int b = 3;
        final int EXPECTED_SUM = 5;

        // 2. действие
        int actualSum = calculator.add(a, b);

        // 3. проверка
        Assertions.assertEquals(actualSum, EXPECTED_SUM);

        // 1. подготовка
        calculator = new Calculator();
        // исходные (тестовые) данные, ожидаемый результат - из документации
        a = -9;
        b = 8;
        final int EXPECTED_DIFFERENCE = -17;

        // 2. действие
        int actualDifference = calculator.subtract(a, b);

        // 3. проверка
        Assertions.assertEquals(actualDifference, EXPECTED_DIFFERENCE);


        // 1. подготовка
        calculator = new Calculator();
        // исходные (тестовые) данные, ожидаемый результат - из документации
        a = 1;
        b = 2;
        final double EXPECTED_QUOTIENT = 0.5;

        // 2. действие
        double actualQuotient = calculator.divide(a, b);

        // 3. проверка
        Assertions.assertEquals(actualQuotient, EXPECTED_QUOTIENT);
    }
}
