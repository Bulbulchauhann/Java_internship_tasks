package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.StudentC;
import in.sp.config.Config1;

public class Main {

	public static void main(String[] args) {
//		using xml file-----------------------------------------------------------------------------------------------
//		ApplicationContext cxt = new ClassPathXmlApplicationContext("/in/sp/config/applicationContext.xml");
//		StudentC s1 = (StudentC) cxt.getBean("patna1");
//		s1.show();
//		StudentC s2 = (StudentC) cxt.getBean("ddn1");
//		s2.show();
		
//		using annotations--------------------------------------------------------------------------------------------
		ApplicationContext cxt = new AnnotationConfigApplicationContext(Config1.class);
		StudentC std = (StudentC) cxt.getBean("patna1");
		std.show();
		
		
		
		
	}
}

//downloads:
//1. Spring beans/core/context/expression
//2. Apache common logging
