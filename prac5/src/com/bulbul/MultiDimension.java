package com.bulbul;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /* 2D array
        1 2 3
        4 5 6
        7 8 9
         */

        Scanner in = new Scanner(System.in);
//        int [][] arr = new int[3][3]; //giving row no. is mandatory, cols is not
//        int [][] arr1 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

//        int[][] arr2 = {
//                {1, 2, 3}, //0th index
//                {4, 5}, //1st index
//                {6, 7, 8, 9} //2nd index -> arr2D[2] = {6, 7, 8, 9}, arr[2][0] = 6
//        };

        int[][] arr3 = new int[3][3];

        //input

        for(int row = 0; row < arr3.length; row++){
            //for each col in every row
            for ( int col = 0; col < arr3[row].length; col++){
                arr3[row][col] = in.nextInt();
            }
        }

        //output

//        for(int row = 0; row < arr3.length; row++){
//            //for each col in every row
//            for ( int col = 0; col < arr3[row].length; col++){
//                System.out.print(arr3[row][col] + " ");
//            }
//            System.out.println();
//        }

        //output - 2nd method
//        for (int row = 0; row < arr3.length; row++) {
//            System.out.println(Arrays.toString(arr3[row]));
//        }

        for (int[] a : arr3) {
            System.out.println(Arrays.toString(a));
        }
    }
}
