package com.bulbul;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Bulbul Chauhan";
        changeName(name);
        System.out.println(name);

        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Rahul Verma"; //not modifying but creating a new object
    }

    ;
    // doing swapping in methods

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //this change will only be valid in this function scope
    }
}

//no pass by reference in java, only pass by value

//primitve: int, short, char, byte---- just passing values
//objects/stuff: passing values of the ref variable
