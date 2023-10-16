package com.pluralsight;

import java.io.FileInputStream;
import java.util.Scanner;

public class BedtimeStories {
    public BedtimeStories() {
    }

    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("goldilocks.txt");
            Scanner scanner = new Scanner(fis);
            String input;

            //to read code line by line in the file.

            while (scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(input);

            }
            //use the scanner closer always!
            scanner.close();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}

