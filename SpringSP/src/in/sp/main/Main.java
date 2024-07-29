package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_loc = "in/sp/resources/applicationContext.xml";
		ApplicationContext cxt = new ClassPathXmlApplicationContext(config_loc);
		
//		Student std = new Student();
//		std.display(); //object created by context file
		
		Student std1 = (Student) cxt.getBean("stdId1");
		std.display();	

		System.out.println("----------------");

		Student std2 = (Student) cxt.getBean("stdId2");
		std.display();	
	}
}

//1. spring-beans-xxx.jar
//2. spring-core-xxx.jar
//3. spring-context-xxx.jar
//4. common-logging-xxx.jar
//5. sping-expression-xxx.jar
