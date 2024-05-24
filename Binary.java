//24-May_2024 - Task 2 -  Converting Integer to Binary Number

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number :: ");

        int a = in.nextInt();

        String b = Integer.toBinaryString(a);

        System.out.println("Converted Binary Number ::" + b);
    }
}
