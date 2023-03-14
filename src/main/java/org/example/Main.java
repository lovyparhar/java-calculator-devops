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

            }
            else if(choice == 2) {

            }
            else if(choice == 3) {

            }
            else if(choice == 4) {

            }
            else {
                System.out.println("Please give a valid choice\n");
            }
        } while(true);
    }
}