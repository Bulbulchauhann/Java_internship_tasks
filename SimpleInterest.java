//24-May-2024/  Task-5/ Calculating Simple Interest

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.print("Enter Principal amount :: ");
        float p = in.nextFloat();

        System.out.print("Enter Rate of Interest in percentage :: ");
        float r = in.nextFloat();

        System.out.print("Enter Time in Years :: ");
        float t = in.nextFloat();

        float SI = (p * r * t) / 100;

        System.out.println("Simple Interest is :: " + SI);
    }
}
