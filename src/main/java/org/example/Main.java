package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Welcome to the Calculator App!\n");
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("0. Exit\n");

            System.out.println("Input the choice number for the operation: ");
            int choice = scanner.nextInt();

            if(choice == 0) {
                break;
            }
            else if(choice == 1) {
                System.out.println("Input number: ");
                double num = scanner.nextDouble();

                System.out.println("Square root of this number is: ");
                System.out.println(calculator.squareRoot(num));
            }
            else if(choice == 2) {
                System.out.println("Input number: ");
                double num = scanner.nextDouble();

                System.out.println("Factorial of this number is: ");
                System.out.println(calculator.factorial(num));
            }
            else if(choice == 3) {
                System.out.println("Input number: ");
                double num = scanner.nextDouble();

                System.out.println("Natural log of this number is: ");
                System.out.println(calculator.naturalLog(num));
            }
            else if(choice == 4) {

                System.out.println("Input the base: ");
                double base = scanner.nextDouble();

                System.out.println("Input the exponent: ");
                double exponent = scanner.nextDouble();

                System.out.println("Base raised to power exponent is: ");
                System.out.println(calculator.power(base, exponent));
            }
            else {
                System.out.println("Please give a valid choice");
            }

            System.out.println("");
        } while(true);
    }
}