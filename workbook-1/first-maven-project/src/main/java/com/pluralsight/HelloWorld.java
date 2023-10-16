package com.pluralsight;

public class HelloWorld {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("An error has occurred with the array!");
        } catch (Exception ex){
            System.out.println("A general exception happened.");
        }
    }
}
