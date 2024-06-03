// package task03june;
import java.util.Scanner;
import task03june.InvalidAgeException;

class InvalidAgeException extends Exception {
    private final int age;
  
    public InvalidAgeException(int age) {
      super("Invalid age: " + age + ". Age must be between 0 and 120.");
      this.age = age;
    }
  
    public int getAge() {
      return age;
     
    }
}


public class ValidateAge {
public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);

    System.out.println("Enter your age: ");
    int age = s1.nextInt();

    try {
      validateAge(age);
      System.out.println("Age is valid.");
    } catch (InvalidAgeException e) {
      System.err.println(e.getMessage());
    }
  }

  static void validateAge(int age) throws InvalidAgeException {
    if ( age < 0 || age > 120) {
      throw new InvalidAgeException(age);
    }
  }
}

