// 24-May_2024- Task 1 - Swapping Two Numbers


import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {

        // question-1
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter two numbers below :: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("First Number :: " + a);
        System.out.println("Second Number :: " + b);

        int c = b;
        b = a;
        a = c;
        System.out.println("After Swapping - ");
        System.out.println("Now first Number is :: " + a);
        System.out.println("Now first Number is :: " + b);

    }
}
