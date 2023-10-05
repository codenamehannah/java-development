package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // We're creating a Basic Calculator
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();    
        
        System.out.println("Enter number 2: "); 
        int num2 = scanner.nextInt(); 
        
        scanner.nextLine();  
        System.out.println("Possible Calculations " +          
                "(A)dd " +                  
                "(S)ubtract " +               
                "(M)ultiply " +          
                "(D)ivide " + "Please select an option: "); 
        String action = scanner.nextLine();

        if (action.equalsIgnoreCase("A")) {
            int result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (action.equalsIgnoreCase("S")) {
            int result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (action.equalsIgnoreCase("M")) {
            int result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (action.equalsIgnoreCase("D")) {
            if (num2 == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                double result = (double) num1 / num2;
                System.out.println("Result: " + result);
            }
        } else {
            System.out.println("Invalid option selected.");
        }

        scanner.close();
    }



}
