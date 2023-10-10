import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheaterReservations {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for their full name
            System.out.print("Please enter your name: ");
            String fullName = scanner.nextLine();

            // Prompt the user for the date of the show (in MM/dd/yyyy format)
            System.out.print("What date will you be coming (MM/dd/yyyy): ");
            String dateInput = scanner.nextLine();

            // Prompt the user for the number of tickets
            System.out.print("How many tickets would you like? ");
            int numTickets = scanner.nextInt();

            // Parse the date input
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date showDate = null;

            try {
                showDate = dateFormat.parse(dateInput);
            } catch (Exception e) {
                System.out.println("Invalid date format. Please use MM/dd/yyyy.");
                scanner.close();
                return;
            }

            // format the confirmation message
            String formattedDate = dateFormat.format(showDate);
            String[] nameParts = fullName.split(" ");
            String lastName = nameParts[nameParts.length - 1];
            String firstName = fullName.replace(lastName, "").trim();

            String confirmationMessage = numTickets == 1
                    ? "1 ticket reserved for " + formattedDate + " under " + lastName + ", " + firstName
                    : numTickets + " tickets reserved for " + formattedDate + " under " + lastName + ", " + firstName;

            // display the confirmation message
            System.out.println(confirmationMessage);

            // Close the scanner
            scanner.close();
        }
}
