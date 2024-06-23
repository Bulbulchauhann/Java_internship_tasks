package com.bulbul;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) { //args is a string array
        Scanner in = new Scanner(System.in);

        //array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 65;
        arr[3] = 87;
        arr[4] = 19;
        //internally now stored like this: {23, 45, 65, 87, 19}
//        System.out.println(arr[3]);

        //input using for loop
//      for (int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }

//        for (int num : arr) { //enhanced for loop, for every element in array, print th element
//            System.out.println(num + " "); //here num represents element of the array
//        }
//        System.out.println(arr[4]); //limit cross-index out of bound exception/error

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "kunaaal";
        System.out.println(Arrays.toString(str));

    }
}
