import java.util.Scanner;


public class uInput {
    public static void main(String[] args) {
        System.out.println();
        // java.util.Scanner a = new java.util.Scanner(System.in);
        Scanner a = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = a.nextInt();

        if(age>=18){
            System.out.println("You can vote.");
        } else {
            System.out.println("Go home chotu");
        }
    }
}

//datatype - object var = new Class()