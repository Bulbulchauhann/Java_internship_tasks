
public class If_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if statement = performs a block of code if it's condition evaluates to be true
		int age = 75;
		if (age>=75) {
			System.out.println("You are in adult!");
			
		}
		else if(age>=18) {
			System.out.println("Ok Boomer");
		}
		else if (age>=13) {
			System.out.println("you are a teenager");
		}
		
		else {
			System.out.println("You are not an adult!");
		}

	}

}
