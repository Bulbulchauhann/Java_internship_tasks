package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Emp1;
import in.sp.context.ConfigFile;

public class Main {

	public static void main(String[] args) {
		String path = "in/sp/context/applicationContext.xml";
		ApplicationContext cxt = new ClassPathXmlApplicationContext(path);
	
//		ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class); 
		Emp1 p1 = (Emp1) cxt.getBean("user1"); 
		p1.interview();
	}
}
