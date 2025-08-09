package by.itacademy;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    public static void start() {
        System.out.println("Сработал метод с аннотацией BeforeAll");
    }

    @BeforeEach
    public void createCalculatorInstance() {
        calculator = new Calculator();
        System.out.println("@BeforeEach");
    }

    @Test
    @Order(3)
    @DisplayName("Проверка метода сложения 2 + 5 = 7")
    public void testAdd() {
        System.out.println("Проверка метода сложения 2 + 5 = 7");
        calculator = new Calculator();
        int actual = calculator.add(2, 5);
        Assertions.assertEquals(actual, 7);
    }

    @Test
    @Order(1)
    @DisplayName("Проверка метода вычитания 8 - 5 = 3")
    public void testSubtract() {
        System.out.println("Проверка метода вычитания 8 - 5 = 3");
        calculator = new Calculator();
        int actual = calculator.subtract(8, 5);
        Assertions.assertEquals(actual, 3);
    }

    @Test
    @Order(2)
    @DisplayName("Проверка метода умножения 8 * 5 = 40")
    public void testMultiply() {
        System.out.println("Проверка метода умножения 8 * 5 = 40");
        calculator = new Calculator();
        int actual = calculator.multiply(8, 5);
        Assertions.assertEquals(actual, 40);
    }

    @Test
    @Order(4)
    @DisplayName("Проверка метода деления 8 / 4 = 2")
    public void testDivide() {
        System.out.println("Проверка метода деления 8 / 4 = 2");
        calculator = new Calculator();
        double actual = calculator.divide(8, 4);
        Assertions.assertEquals(actual, 2);
    }

    @AfterEach
    @DisplayName("AfterEach")
    public void afterEach() {
        System.out.println("@AfterEach");
    }
}
