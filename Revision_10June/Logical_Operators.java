
public class Logical_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Logical operator = used to connect two or more expressions
		//&&= (AND) both condition must be true
		//|| = (OR) either condition must be true
		//! = (NOT) reverses boolean value of condition
		
		int temp = 25;
		
		if(temp>30) {
			System.out.println("it is hot outside");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
			
		}
		else {
			System.out.println("It is Cold Outside");
		}

	}

}
