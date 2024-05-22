package com.bulbul;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter first number::");
        int n1 = input.nextInt();
        System.out.println("Please Enter second number::");
        int n2 = input.nextInt();

        int n3 = n1 + n2;

        System.out.println("Addition:: " + n3 );
    }
}
