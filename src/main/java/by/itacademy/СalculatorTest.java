package by.itacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class СalculatorTest {
    @Test
    public void test1(){
        Calculator calculator = new Calculator();
        int actual = calculator.add(2,5);
        Assertions.assertEquals(7,actual);
    }
}
