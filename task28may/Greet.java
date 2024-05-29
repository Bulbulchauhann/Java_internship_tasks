import java.util.Scanner;

class Person { // class
    private String name; // attributes
    private int age;

    
    //  // Constructor
     public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        String msg = "Hello,  " + name + "! Your are " + age + " years old.";
        System.out.println(msg);
    }
}

public class Greet {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in) ;
        System.out.print("Naam Likho : ");
        String name = in.nextLine();
        System.out.println("Age Likho : ");
        int age = in.nextInt();

        Person p  = new Person(name, age);
        p.greet();
    
    }
}

