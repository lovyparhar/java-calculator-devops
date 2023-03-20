package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;

public class CalculatorTest {

    private Calculator calculator;
    private static final double EPSILON = 1e-10;
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    @Before
    public void setUpCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void testSquareRoot() {
        Assert.assertEquals("Square root test", 2, calculator.squareRoot(4), EPSILON);
        Assert.assertNotEquals("Square root test", 1, calculator.squareRoot(4), EPSILON);
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals("Factorial test", 24, calculator.factorial(4), EPSILON);
        Assert.assertNotEquals("Factorial test", 24, calculator.factorial(3), EPSILON);
    }

    @Test
    public void testNaturalLog() {
        Assert.assertEquals("Natural log test", 2.6390573296152584, calculator.naturalLog(14), EPSILON);
    }

    @Test
    public void testPower() {
        Assert.assertEquals("Exponentiation test", 8, calculator.power(2, 3), EPSILON);
    }

    @After
    public void tearDown() {
        calculator = null;
        logger.info("Testing is over");
    }
}
