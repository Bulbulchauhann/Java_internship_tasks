//typecasting and conversion
package com.bulbul;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
 //       float num = input.nextFloat(); //will give an error because float>int
//        int num = inout.nextFloat(); //will give an error because int<float
//          System.out.println(num);

//          typecasting- compressing the bigger type into smaller one explicitly
//        int num = (int)(776.8907f); //coverting integer into float
//        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); //257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;  // java is automatically promoting byte to integer to perform the functions
//
//        System.out.println(d);
//
//        byte b = 50;
//        b = b * 2 ;


//        int number = 'a'; //automatic type conversion,  ascar value
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);



    }
}


/*conditions for conversion:
* 1. Two types should be compatible.
* 2. Destination type should be greater than the source type.
* 3.  All byte, short and char values are promoted to integer
* 4. if any one operand is long/float, then the whole operation will be promoted to long/float.
* 5. float/double > integer > char/byte,short etc
* 6. all smaller datatypes will convert into bigger one.
 */

//java follows unicode, can print any language

//example-


