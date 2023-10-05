package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print("What is your name? ");
String name = scanner.nextLine();
System.out.println("How many hours have you worked? ");
float hoursWorked = scanner.nextFloat();

System.out.println("What is your pay rate? ");
float payRate = scanner.nextFloat();

//Calculate Gross Pay
scanner.nextLine();
float grossPay = hoursWorked * payRate;

System.out.println(name + ", your Gross Pay for this period is: $" + grossPay);

        scanner.close();
    }
}
