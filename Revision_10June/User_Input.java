import java.util.Scanner;
public class User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is Your name?:");
		String name = scanner.nextLine();
		System.out.println("How old are you?:");
		int Age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is Your favorite food?");
		String food = scanner.nextLine();
		
		
		System.out.println("Hello "+name);
		System.out.println("You are  "+Age+" Years Old");
		System.out.println("You like "+food);
		scanner.close();
		

	}

}
