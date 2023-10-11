
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //We're building an Address Builder
        StringBuilder customerInfo = new StringBuilder();
        StringBuilder billingAddress = new StringBuilder();
        StringBuilder shippingAddress = new StringBuilder();

        System.out.println("Full Name: ");
        String fullName = scanner.nextLine();

        customerInfo.append(fullName).append("\n");

        System.out.println("BillingAddress");
        System.out.print("BillingStreet: ");
        String billingStreet = scanner.nextLine();
        billingAddress.append(billingStreet).append("\n");


        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();
        billingAddress.append(billingCity).append(", ");

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();
        billingAddress.append(billingState).append(" ");

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();
        billingAddress.append(billingZip).append("\n");

        System.out.println("Shipping Address:");
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        shippingAddress.append(shippingStreet).append("\n");

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        shippingAddress.append(shippingCity).append(", ");

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();
        shippingAddress.append(shippingState).append(" ");

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();
        shippingAddress.append(shippingZip).append("\n");

        customerInfo.append("Billing Address:\n").append(billingAddress).append("Shipping Address:\n").append(shippingAddress);

        System.out.println("Customer Information:\n" + customerInfo.toString());

        scanner.close();


    }
}
