package com.bulbul;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //syntax
        //datatype[] variable_name = new datatype[size];
        //storing 5 roll nos:
        int[] ros;// value of this  by default is going to be null
        int[] rnos = new int[5];
        //or directly
        int[] rnos2 = {2, 12, 13, 14, 15};
        String[] name = new String[4];
        String[] name1 = {"Bulbul", "Pooja", "Rahul", "Vivek"};

        System.out.println(rnos[1]);
        System.out.println(rnos2[1]);
        System.out.println(name[1]);
        System.out.println(name1[1]);


        for (String element : name) {
            System.out.println(element);
        }

        //null and none in python
        //only non-primitive datatypes can have null value
        //String str = null;
        //int num = null; - will give an error
    }

}

//new = to create an object
//primitives are stored in stack memory (char, boolean, int)
//non-primitive are stored in heap memory (object, string)
// all ref variable points to null when not initialised