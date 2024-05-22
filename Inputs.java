//identifiers- name of variable, method, class, package, or other things like interfaces
package com.bulbul;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("please enter your rollno: ");
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is " + rollno);

//        int a = 234_000_000; //_underscore instead of comma to define values
//        System.out.println(a);

//        String name = input.nextLine();
//        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks); //floatingPointError - values are not accurate because float rounds off the actual values

    }
}
