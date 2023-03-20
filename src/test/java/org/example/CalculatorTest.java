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
        Assert.assertEquals("Square root test 1", 2, calculator.squareRoot(4), EPSILON);
        Assert.assertEquals("Square root test 2", 7.416198487095662948711, calculator.squareRoot(55), EPSILON);
        Assert.assertEquals("Square root test 3", 9.746794344808963906838, calculator.squareRoot(95), EPSILON);
        Assert.assertNotEquals("Square root test 4", 1, calculator.squareRoot(4), EPSILON);
        Assert.assertNotEquals("Square root test 5", 10, calculator.squareRoot(10), EPSILON);
        Assert.assertNotEquals("Square root test 6", 11, calculator.squareRoot(2), EPSILON);
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals("Factorial test 1", 24, calculator.factorial(4), EPSILON);
        Assert.assertEquals("Factorial test 2", 3628800, calculator.factorial(10), EPSILON);
        Assert.assertEquals("Factorial test 3", 40320, calculator.factorial(8), EPSILON);
        Assert.assertNotEquals("Factorial test 4", 24, calculator.factorial(3), EPSILON);
        Assert.assertNotEquals("Factorial test 5", 32, calculator.factorial(9), EPSILON);
        Assert.assertNotEquals("Factorial test 5", 84, calculator.factorial(8), EPSILON);
    }

    @Test
    public void testNaturalLog() {
        Assert.assertEquals("Natural log test 1", 2.6390573296152584, calculator.naturalLog(14), EPSILON);
        Assert.assertEquals("Natural log test 2", 3.091042453358315853479, calculator.naturalLog(22), EPSILON);
        Assert.assertEquals("Natural log test 3", 5.717027701406221697678, calculator.naturalLog(304), EPSILON);
        Assert.assertNotEquals("Natural log test 4", 22, calculator.naturalLog(14), EPSILON);
        Assert.assertNotEquals("Natural log test 5", 3, calculator.naturalLog(22), EPSILON);
        Assert.assertNotEquals("Natural log test 6", 6, calculator.naturalLog(304), EPSILON);
    }

    @Test
    public void testPower() {
        Assert.assertEquals("Exponentiation test", 8, calculator.power(2, 3), EPSILON);
        Assert.assertEquals("Exponentiation test", 1544.804416, calculator.power(3.4, 6), EPSILON);
        Assert.assertEquals("Exponentiation test", 81, calculator.power(9, 2), EPSILON);
        Assert.assertNotEquals("Exponentiation test", 4, calculator.power(2, 3), EPSILON);
        Assert.assertNotEquals("Exponentiation test", 6, calculator.power(2, 3), EPSILON);
        Assert.assertNotEquals("Exponentiation test", 64, calculator.power(2, 5), EPSILON);
    }

    @After
    public void tearDown() {
        calculator = null;
        logger.info("Testing is over");
    }
}
