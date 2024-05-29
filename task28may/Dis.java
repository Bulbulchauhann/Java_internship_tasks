import java.util.Scanner;

public class Dis {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Prompt the user for the first coordinate
            System.out.print("Enter the x-coordinate of the first point: ");
            double x1 = in.nextDouble();
            System.out.print("Enter the y-coordinate of the first point: ");
            double y1 = in.nextDouble();

            // Prompt the user for the second coordinate
            System.out.print("Enter the x-coordinate of the second point: ");
            double x2 = in.nextDouble();
            System.out.print("Enter the y-coordinate of the second point: ");
            double y2 = in.nextDouble();

            // Create a DistanceCalculator object
            DistanceCalculator calculator = new DistanceCalculator();

            // Calculate and display the distance
            double distance = calculator.calculateDistance(x1, y1, x2, y2);
            System.out.println("The distance between the two points is: " + distance);
        }
    }
}

// Defining the DistanceCalculator class
class DistanceCalculator {
    // Method to calculate the distance between two coordinates
    public double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
