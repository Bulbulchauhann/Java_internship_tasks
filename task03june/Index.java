package task03june;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the index : ");
        int index = in.nextInt();

        try{
            int val = n[index];
            System.out.println("Index : " + index + ", Value : " + val);
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Array index not found");
        }
    }
}
