package com.pluralsight;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car rayCar = new Car("Pink")
        System.out.println(rayCar.getSpeed());

        rayCar.accelerate(10);
        rayCar.accelerate(10);

        System.out.println(rayCar.getSpeed());

        rayCar.brake(30);
        System.out.println(rayCar.getSpeed())