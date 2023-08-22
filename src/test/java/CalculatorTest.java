import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;

        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 0;

        int actualPositive = calculator.subtract(2, 1);
        int actualNegative = calculator.subtract(1, 2);
        int actualZero = calculator.subtract(2, 2);

        // result must be positive
        assertTrue(expected > actualNegative);

        // result must be negative
        assertTrue(expected < actualPositive);

        // result must be zero
        assertEquals(expected, actualZero);
    }

    @Test
    public void testMultiply() {
        int expected = 10;

        int actual = calculator.multiply(5, 2);
        
        assertEquals(expected, actual);

    }

    @Test
    public void testDivide() {
        int expected = 5;

        int actual = calculator.divide(10, 2);

        assertEquals(expected, actual);
    }
}
