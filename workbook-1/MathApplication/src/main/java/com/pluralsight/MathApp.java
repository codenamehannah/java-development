
public class MathApp {
    public static void main(String[] args) {

        // Question 1: represent the salary of Bob & Gary.
        // declare variables here

        int bobSalary = 62900, garySalary = 55432;
        // then code solution
        int highestSalary = Math.max(bobSalary, garySalary);
        // then use System.out.println() to display results
        System.out.println("The higher salary is " + highestSalary);
        // ex: System.out.println("The answer is " + answer);



        // Question 2: Minimum of two Vehicles
        // declare variables here
        int carPrice = 24000, truckPrice = 32000;
        // then code solution
        int minimumPrice = Math.min(carPrice, truckPrice);
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The lower price of the two vehicles is " + minimumPrice);



        // Question 3: Display the area of a circle whose radius is 7.25
        // declare variables here
        double radius = 7.25;
        // then code solution
        double area = Math.PI * Math.pow(radius, 2);
        // then use System.out.println() to display results
        System.out.println("The area of the circle with the radius " + radius + " is: " + area);



        // Question 4: Display the square root of a variable set to 5.0
        // declare variables here
        double number = 5.0;
        // then code solution
        double squareRoot = Math.sqrt(number);

        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The square root of " + number + " is: " + squareRoot);



        // Question 5: Display the distance between the points (5,10) and (85,50)
        // declare variables here
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        // then code solution
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);


        // Question 6:     Display the absolute (positive) value of a variable after it is set to -3.8
        // declare variables here
        double wybe = -3.8;
        // then code solution
        double absoluteValue = Math.abs(number);
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The absolute value of " + wybe + " is: " + absoluteValue);


        // Question 7:      Display a random number between 0 and 1
        // declare variables here
        double randomNumber = Math.random();
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Random number between 0 and 1: " + randomNumber);



    }
}