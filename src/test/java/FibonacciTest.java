import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases:
 * fibonacci -1 -> throw new RuntimeException
 * fibonacci 0 -> 0
 * fibonacci 1 -> 1
 * fibonacci 2 -> 1
 * fibonacci 3 -> 2
 * fibonacci 5 -> 5
 * fibonacci 12 -> 144
 */
class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @AfterEach
    public void finish(){
        fibonacci = null;
    }

    @Test
    public void shouldThrowExceptionIfTheNumberIsNegative() {
        var fibonacci = new Fibonacci();
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1)) ;
    }

    @Test
    public void shouldComputeReturnZeroIfTheNumberIsZero() {
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne() {
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsTwo() {
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(2);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnTwoIfTheNumberIsThree() {
        int expectedValue = 2;
        int obtainedValue = fibonacci.compute(3);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnFiveIfTheNumberIsFive() {
        int expectedValue = 2;
        int obtainedValue = fibonacci.compute(3);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneHundredFortyFourIfTheNumberIsTwelve() {
        int expectedValue = 144;
        int obtainedValue = fibonacci.compute(12);

        assertEquals(expectedValue,obtainedValue);
    }


}