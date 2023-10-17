package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        //System.out.println("Today is: " + today);

        LocalTime currentTime = LocalTime.now();
        //System.out.println("The current time is: " + currentTime);

        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Right now is: " + rightNow);


  /*      System.out.println("Day of week: " + today.getDayOfWeek());
        System.out.println("Day of Month: " + today.getDayOfMonth());
        System.out.println("Day of Year: " + today.getDayOfYear());
        System.out.println("Month Name: " + today.getMonth());
        System.out.println("Month Value: " + today.getMonthValue());
        System.out.println("Year: " + today.getYear());


        System.out.println("================================================");

        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Second: " + currentTime.getSecond());
        System.out.println("Nanosecond: " + currentTime.getNano());*/


        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");

        String formattedDate = rightNow.format(fmt);
        System.out.println("The formatted result is: " + formattedDate);

        String userInput = "10/17/2022";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate birthDay = LocalDate.parse(userInput,formatter);

        System.out.println(birthDay);
    }
    }

