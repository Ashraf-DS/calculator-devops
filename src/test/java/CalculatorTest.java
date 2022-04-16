import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.fact(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.fact(4), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 5040, calculator.fact(7), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 40320, calculator.fact(8), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.fact(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calculator.fact(3), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 720, calculator.fact(8), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 40320, calculator.fact(10), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, calculator.power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 64, calculator.power(4, 3), DELTA);
        assertEquals("Finding power for True Positive", 27, calculator.power(3, 3), DELTA);
        assertEquals("Finding power for True Positive", 125, calculator.power(5, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calculator.power(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.power(2, 3), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.power(3, 3), DELTA);
        assertNotEquals("Finding power for False Positive", 9, calculator.power(5, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);

    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("Finding square root for True Positive", 2, calculator.sqroot(4), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.sqroot(1), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.sqroot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.sqroot(4), DELTA);

    }

    @Test
    public void sineTruePositive(){
        assertEquals("Finding sine  for True Positive", 0, calculator.sine(0), DELTA);
        assertEquals("Finding sine  for True Positive", 0.9999999792586128, calculator.sine(1.571), DELTA);

    }

    @Test
    public void sineFalsePositive(){
        assertNotEquals("Finding sine for False Positive", 1, calculator.sine(0), DELTA);
        assertNotEquals("Finding sine for False Positive", 10, calculator.sine(1), DELTA);

    }

    @Test
    public void cosineTruePositive(){
        assertEquals("Finding sine  for True Positive", 1, calculator.cosine(0), DELTA);
        assertEquals("Finding sine  for True Positive", -2.0367320369517786E-4, calculator.cosine(1.571), DELTA);

    }

    @Test
    public void cosineFalsePositive(){
        assertNotEquals("Finding sine for False Positive", 10, calculator.cosine(0), DELTA);
        assertNotEquals("Finding sine for False Positive", 10, calculator.cosine(1), DELTA);

    }

    @Test
    public void maximumTruePositive(){
        assertEquals("Finding maximum for True Positive", 5, calculator.maximum(4,5), DELTA);
        assertEquals("Finding maximum for True Positive", 1, calculator.maximum(1,1), DELTA);
        assertEquals("Finding maximum for True Positive", 99, calculator.maximum(99,9), DELTA);
        assertEquals("Finding maximum for True Positive", 166, calculator.maximum(16,166), DELTA);
    }
    @Test
    public void maximumFalsePositive(){
        assertNotEquals("Finding maximum for False Positive", 15, calculator.maximum(4,5), DELTA);
        assertNotEquals("Finding maximum for False Positive", 12, calculator.maximum(1,1), DELTA);
        assertNotEquals("Finding maximum for False Positive", 9, calculator.maximum(99,9), DELTA);
        assertNotEquals("Finding maximum for False Positive", 1661, calculator.maximum(16,166), DELTA);
    }

    // test cases for minimum function
    @Test
    public void minimumTruePositive(){
        assertEquals("Finding minimum for True Positive", 4, calculator.minimum(4,5), DELTA);
        assertEquals("Finding minimum for True Positive", 1, calculator.minimum(1,1), DELTA);
        assertEquals("Finding minimum for True Positive", 9, calculator.minimum(99,9), DELTA);
        assertEquals("Finding minimum for True Positive", 16, calculator.minimum(16,166), DELTA);
    }
    @Test
    public void minimumFalsePositive(){
        assertNotEquals("Finding minimum for False Positive", 5, calculator.minimum(4,5), DELTA);
        assertNotEquals("Finding minimum for False Positive", 12, calculator.minimum(1,1), DELTA);
        assertNotEquals("Finding minimum for False Positive", 99, calculator.minimum(99,9), DELTA);
        assertNotEquals("Finding minimum for False Positive", 166, calculator.minimum(16,166), DELTA);
    }


}
