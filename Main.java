package com.bulbul;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1, n2, sum;
        System.out.println("Enter 1st number:");
        n1 = in.nextInt();
        System.out.println("Enter second number:");
        n2 = in.nextInt();
        sum = n1 + n2;

        System.out.println("addition" + sum);

    }
}
