package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibraryApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Book[] inventory = createBookInventory(); // Create an array of books on this section here.

            while (true) {
                System.out.println("Neighborhood Library - Home Screen");
                System.out.println("1. Show Available Books");
                System.out.println("2. Show Checked Out Books");
                System.out.println("3. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        showAvailableBooks(inventory, scanner);
                        break;
                    case 2:
                        showCheckedOutBooks(inventory, scanner);
                        break;
                    case 3:
                        System.out.println("Exiting...See You Later, Alligator!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Select a valid option, please.");
                }
            }
        }

        private static Book[] createBookInventory() {
            // Create an array of t least five books you love.
            Book[] inventory = new Book[10];

            inventory[0] = new Book(1, "9781616201340", "An American Marriage by Tayari Jones");
            inventory[1] = new Book(2, "9780593133817", "Red at the Bone by Jacqueline Woodson");
            inventory[2] = new Book(3, "9780307275936", "If Beale Street Could Talk by James Baldwin");
            inventory[3] = new Book(4, "9780399587672", "The Wedding Date by Jasmine Guillory");
            inventory[4] = new Book(5, "9781696409580", "Let's Get Textual by Teagan Hunter");
            inventory[5] = new Book(6, "901234567", "Becoming by Michelle Obama");
            inventory[6] = new Book(7, "012345678", "Queenie by Candice Carty-Williams");
            inventory[7] = new Book(8, "123456789", "Sing, Unburied, Sing by Jesmyn Ward");
            inventory[8] = new Book(9, "234567890", "The Water Dancer by Ta-Nehisi Coates");
            inventory[9] = new Book(10, "345678901", "Such a Fun Age by Kiley Reid");

            return inventory;
            // Girl what do we do next???
            //We have to print the checked in and checked out portion of the code:
        }

        private static void showAvailableBooks(Book[] inventory, Scanner scanner) {
            System.out.println("Available Books:");
            for (Book book : inventory) {
                if (!book.isCheckedOut()) {
                    System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
                }
            }

            System.out.println("Select a book to check out (enter the book ID) or enter 'X' to go back:");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("X")) {
                return;
            }

            int bookId = Integer.parseInt(choice);
            for (Book book : inventory) {
                if (book.getId() == bookId && !book.isCheckedOut()) {
                    System.out.print("Enter your name to check out the book: ");
                    String name = scanner.nextLine();
                    book.checkOut(name);
                    return;
                }
            }

            System.out.println("Invalid book ID or the book is already checked out.");
        }

        private static void showCheckedOutBooks(Book[] inventory, Scanner scanner) {
            System.out.println("Checked Out Books:");
            for (Book book : inventory) {
                if (book.isCheckedOut()) {
                    System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle() + ", Checked Out To: " + book.getCheckedOutTo());
                }
            }

            System.out.println("Select a book to check in (enter book ID) or enter 'X' to go back:");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("X")) {
                return;
            }

            int bookId = Integer.parseInt(choice);
            for (Book book : inventory) {
                if (book.getId() == bookId && book.isCheckedOut()) {
                    book.checkIn();
                    return;
                }
            }

            System.out.println("Invalid book ID or the book is not checked out.");
        }
    }

