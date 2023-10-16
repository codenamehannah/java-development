package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone newCellPhone = new CellPhone();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the serial number of the phone: ");
        int serialNumberFromTheUser = scanner.nextInt();
        scanner.nextLine();
        newCellPhone.setSerialNumber(serialNumberFromTheUser);

        System.out.print("Please enter the model of the phone: ");
        String modelFromTheUser = scanner.nextLine();
        newCellPhone.setModel(modelFromTheUser);



        System.out.print("please enter the name of the phone's carrier: ");
        String carrierFromTheUser = scanner.nextLine();
        newCellPhone.setCarrier(carrierFromTheUser);


        System.out.print("Please enter the Phone Number: ");
        String phoneNumberFromTheUser = scanner.nextLine();
        newCellPhone.setPhoneNumber(phoneNumberFromTheUser);


        System.out.print("Please enter the name of the owner of the phone: ");
        String ownerFromTheUser = scanner.nextLine();
        newCellPhone.setOwner(ownerFromTheUser);


        /* Phone newPhone = new Phone(serialNumberFromTheUser,
        modelFromTheUser, carrierFromTheUser, phoneNumberFromTheUser)*/



        System.out.println("The Serial Number of this phone is: " + newCellPhone.getSerialNumber());

        System.out.println("The Model of this phone is: " + newCellPhone.getModel());
        System.out.println("The Carrier of this phone is: " + newCellPhone.getCarrier());
        System.out.println("The Phone Number of this phone is: " + newCellPhone.getPhoneNumber());
        System.out.println("The owner of this phone is: " + newCellPhone.getOwner());

    }
    public static void

        }