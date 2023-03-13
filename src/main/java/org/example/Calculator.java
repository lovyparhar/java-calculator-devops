package org.example;

public class Calculator {
    private static final double EPSILON = 1e-10;
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public double factorial(double num) {
        double ans = 1;
        for(double i = 1; i <= num + EPSILON; i+=1) {
            ans = ans * i;
        }
        return ans;
    }

    public double naturalLog(double num) {
        return Math.log(num);
    }

    public double power(double base, double exp) {
        return Math.pow(base, exp);
    }
}
