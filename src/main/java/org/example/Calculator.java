package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final double EPSILON = 1e-10;
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double squareRoot(double num) {
        logger.info("Called squareRoot function with argument: " + num);
        double ans = Math.sqrt(num);
        logger.info("Returned value from squareRoot function: " + ans);
        return ans;
    }

    public double factorial(double num) {
        logger.info("Called factorial function with argument: " + num);
        double ans = 1;
        for(double i = 1; i <= num + EPSILON; i+=1) {
            ans = ans * i;
        }
        logger.info("Returned value from factorial function: " + ans);
        return ans;
    }

    public double naturalLog(double num) {
        logger.info("Called naturalLog function with argument: " + num);
        double ans = Math.log(num);
        logger.info("Returned value from naturalLog function: " + ans);
        return ans;
    }

    public double power(double base, double exp) {
        logger.info("Called power function with arguments: " + base + " and " + exp);
        double ans = Math.pow(base, exp);
        logger.info("Returned value from power function: " + ans);
        return ans;
    }
}
