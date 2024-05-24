//24-May-2024/ Task-3/ Finding factorial of a number

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number :: ");

        int a = in.nextInt();

       long res = 1;
        for (int i = 1; i<= a; i++) {
           res *= i;
        }
       System.out.println(res);
    }
}
