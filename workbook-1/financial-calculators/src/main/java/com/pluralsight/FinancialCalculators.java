package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Allow the usr to make a choice:
            int choice;
            do {
                System.out.println("Select a Calculator:");
                System.out.println("1. Mortgage Calculator");
                System.out.println("2. Future Value Calculator");
                System.out.println("3. Present Value Calculator");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");


                //Switch here:

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        calculateMortgage(scanner);
                        break;
                    case 2:
                        calculateFutureValue(scanner);
                        break;
                    case 3:
                        calculatePresentValue(scanner);
                        break;
                    case 4:
                        System.out.println("Exiting the Financial Calculator. GoodBye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        break;
                }
            } while (choice != 4);

            // Scanner closes here:
            scanner.close();
        }
            //Mortgage Calculator: Compile each print statement together:
        public static void calculateMortgage(Scanner scanner) {
            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the annual interest rate (in percentage): ");
            double annualInterestRate = scanner.nextDouble();

            System.out.print("Enter the loan length (in years): ");
            int loanLengthYears = scanner.nextInt();

            double monthlyInterestRate = (annualInterestRate / 100) / 12;
            int numberOfPayments = loanLengthYears * 12;

            //Note: we're using the Math.pow

            double monthlyPayment = (principal * monthlyInterestRate) /
                    (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

            double totalInterest = (monthlyPayment * numberOfPayments) - principal;

            System.out.printf("A $%.2f loan at %.2f%% interest for %d years would have a $%.2f monthly payment with a total interest of $%.2f%n",
                    principal, annualInterestRate, loanLengthYears, monthlyPayment, totalInterest);
        }
         // Calculate the future value here:
        public static void calculateFutureValue(Scanner scanner) {
            System.out.print("Enter the initial deposit: ");
            double initialDeposit = scanner.nextDouble();

            System.out.print("Enter the annual interest rate (in percentage): ");
            double annualInterestRate = scanner.nextDouble();

            System.out.print("Enter the number of years: ");
            int numberOfYears = scanner.nextInt();

            double monthlyInterestRate = (annualInterestRate / 100) / 12;
            int numberOfMonths = numberOfYears * 12;

            double futureValue = initialDeposit * Math.pow(1 + monthlyInterestRate, numberOfMonths);

            double totalInterest = futureValue - initialDeposit;

            System.out.printf("If you deposit $%.2f in an account with %.2f%% interest and it matures in %d years, the ending balance will be $%.2f and you would have earned $%.2f in interest.%n",
                    initialDeposit, annualInterestRate, numberOfYears, futureValue, totalInterest);
        }
        // Add your present value calculation here:
        public static void calculatePresentValue(Scanner scanner) {
            System.out.print("Enter the monthly payout: ");
            double monthlyPayout = scanner.nextDouble();

            System.out.print("Enter the expected annual interest rate (in percentage): ");
            double annualInterestRate = scanner.nextDouble();

            System.out.print("Enter the number of years to pay out: ");
            int numberOfYears = scanner.nextInt();

            double monthlyInterestRate = (annualInterestRate / 100) / 12;
            int numberOfMonths = numberOfYears * 12;

            double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths)) / monthlyInterestRate;

            System.out.printf("To fund an annuity that pays $%.2f monthly for %d years and earns an expected %.2f%% interest, you would need to invest $%.2f today.%n",
                    monthlyPayout, numberOfYears, annualInterestRate, presentValue);
        }
    }




