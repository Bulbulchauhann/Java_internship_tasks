import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            double radius = in.nextDouble();

            // Circle object
            Circle circle = new Circle (radius);

            // Calculate and display the area
            circle.displayArea();
        }
    }
}
class Circle {
    double radius; //Attribute

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display the area
    public void displayArea() {
        double area = calculateArea();
        System.out.println("The area of the circle is: " + area);
    }
}

