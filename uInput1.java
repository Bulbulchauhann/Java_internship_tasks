import java.math.BigInteger;
import java.util.Scanner;

public class uInput1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //boolean input
        // System.out.println("Do you have a laptop ?");
        //  boolean laptop = in.nextBoolean();

        // if(laptop){
        //     System.out.println("yes, you have a laptop");
        // } else {
        //     System.out.println("hehehe gareeb");
        // }
       
        // long input
        // System.out.println("Enter your digits : ");
        // long a = in.nextLong();
        // System.out.println("Your contact no. - " + a);

        
        // double input
        // System.out.println("Enter your digits : ");
        // double a = in.nextDouble();
        // System.out.println("Your contact no. - " + a);

        
        // float input
        // System.out.println("Enter your height in foot and inch : ");
        // float a = in.nextFloat();
        // System.out.println("Your height is : " + a);

        
        // short input
        // System.out.println("Enter your digits : ");
        // short a = in.nextShort();
        // System.out.println("Your contact no. - " + a);

        //Big Integer input
        System.out.println("Enter your digits : ");
        BigInteger phone = in.nextBigInteger();
        System.out.println("Contact : " + phone);

        // table program
        // System.out.print("Enter a number : ");
        // int num = in.nextInt();

        for (int i = 0; i<= 10; i++){
            System.out.println(num*i);
        }
    }
}
