import java.util.Scanner;

public class RecArea {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
           
            System.out.print("Enter the length of the rectangle: ");
            double l = in.nextDouble();

            System.out.print("Enter the breadth of the rectangle: ");
            double b = in.nextDouble();

            Rectangle rectangle = new Rectangle(l, b);

            rectangle.displayArea();
        }
    }
}

class Rectangle {
    double length;
    double breadth;

    // Constructor
    public Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public double calculateArea() {
        return length * breadth;
    }

    // Method to display the area
    public void displayArea() {
        double area = calculateArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
