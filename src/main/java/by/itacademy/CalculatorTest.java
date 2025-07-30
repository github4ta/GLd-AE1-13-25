package by.itacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @DisplayName("Проверка метода сложения 2 + 5 = 7")
    public void testAdd() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(2, 5);
        Assertions.assertEquals(actual, 7);
    }

    @Test
    @DisplayName("Проверка метода вычитания 8 - 5 = 3")
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int actual = calculator.subtract(8, 5);
        Assertions.assertEquals(actual, 3);
    }

    @Test
    @DisplayName("Проверка метода умножения 8 * 5 = 40")
    public void testMyltiply() {
        Calculator calculator = new Calculator();
        int actual = calculator.multiply(8, 5);
        Assertions.assertEquals(actual, 40);
    }

    @Test
    @DisplayName("Проверка метода деления 8 / 4 = 2")
    public void testDivide() {
        Calculator calculator = new Calculator();
        double actual = calculator.divide(8, 4);
        Assertions.assertEquals(actual, 2);
    }
}
