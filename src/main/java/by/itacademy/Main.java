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
    }
}
