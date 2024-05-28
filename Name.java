import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("Enter password : ");
        String pwd = in.nextLine();
        // System.out.println("Your password is : " + pwd);

        if(name.equals("bulbul") & pwd.equals("123")){
            System.out.println("Authorised User");
        } else {
            System.out.println("Unauthorised User");
        }

        // if (name.equals("bulbul") || name.equals(null)) {
        //     if (pwd.equals("123")){
        //         System.out.println("loggin in");
        //     }
        //     System.out.println("Authorised user!");
        // } else {
        //     System.out.println("Unauthorised User");
        // }
      
    //     if(name.equals("bulbul")) {
    //         System.out.println("Hi Bulbulllll");
    //     } else {
    //         System.out.println("tu kon hai bhai???");
    //     }
    }
}
