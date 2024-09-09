package com.bulbul;
import java.util.Scanner;

public class StringEg {
    public static void main(String[] args) {
//        String msg = greet();
//        System.out.println(msg);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String msg = "Hello " + name ;
        return msg;
    }

    static String greet() {
        String greeting = "How are you";
        return greeting;
    }
}
