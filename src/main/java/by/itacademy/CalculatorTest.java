package by.itacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @DisplayName("Проверка метода сложения 2 + 5 = 7")
    public void test1() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(2, 5);
        Assertions.assertEquals(actual, 7);
    }
}
