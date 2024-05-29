import java.util.Scanner;

public class CalApp {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Prompt the user for the first number
            System.out.print("Enter the first number: ");
            double num1 = in.nextDouble();

            // Prompt the user for the second number
            System.out.print("Enter the second number: ");
            double num2 = in.nextDouble();

            // Prompt the user for the operation
            System.out.print("Enter the operation (+, -, *, /): ");
            char operation = in.next().charAt(0);

            // Create a Calculator object
            Calculator calculator = new Calculator();

            // Perform the selected operation and display the result
            double result = 0;
            boolean validOperation = true;
            switch (operation) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = calculator.divide(num1, num2);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    validOperation = false;
            }

            // Display the result if the operation was valid
            if (validOperation) {
                System.out.println("The result is: " + result);
            }
        }
    }
}

// Defining the Calculator class
class Calculator {
    // Method to add two numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    public double divide(double a, double b) {
        return a / b;
    }
}
