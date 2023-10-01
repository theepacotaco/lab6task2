import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for gallons of gas, fuel efficiency, and price per gallon
        double gallonsInTank, fuelEfficiency, pricePerGallon;

        System.out.print("Enter the number of gallons of gas in the tank: ");
        gallonsInTank = getDoubleInput(scanner);

        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        fuelEfficiency = getDoubleInput(scanner);

        System.out.print("Enter the price of gas per gallon: $");
        pricePerGallon = getDoubleInput(scanner);

        // Check for valid input
        if (gallonsInTank <= 0 || fuelEfficiency <= 0 || pricePerGallon <= 0) {
            System.out.println("Error: Invalid input. Please enter positive values.");
            System.exit(1); // Exit with an error code
        }

        // Calculate cost per 100 miles
        double costPer100Miles = (100.0 / fuelEfficiency) * pricePerGallon;

        // Calculate how far the car can go with the gas in the tank
        double distance = gallonsInTank * fuelEfficiency;

        // Display the results
        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance the car can go with the gas in the tank: " + distance + " miles");

        scanner.close();
    }

    // Helper method to get a valid double input from the user
    private static double getDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next(); // Consume the invalid input
        }
        return scanner.nextDouble();
    }
}
