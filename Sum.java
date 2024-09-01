package com.bulbul;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       // int ans = sum2();
       // System.out.println(ans);

        int ans = sum3(20,30);
        System.out.println(ans);

    }

    //pass the value of numbers when you are calling the methos in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    //return the value
   static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = in.nextInt();
        System.out.println("Enter second number:");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.println("The sum = " + sum);

       return n1;
   }

    /*

       access modifier (OOPS) return_type name (arguments) {
             //body
             return statement;
        }

     */
}
