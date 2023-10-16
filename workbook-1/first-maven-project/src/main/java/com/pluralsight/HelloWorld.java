package com.pluralsight;

import java.io.FileInputStream;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //First Create a new File input Stream
        //Instead of putting new scanner or System.in, you put the name of the file.
        // Specify the file we're using.
        //use a while loop (scanner.hasNextLine)
        try {
            FileInputStream fis = new FileInputStream("poem.txt");

            Scanner scanner = new Scanner(fis);

            String input;
            //to read code line by line in the file.

            while(scanner.hasNextLine()){
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
