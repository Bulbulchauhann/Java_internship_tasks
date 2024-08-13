package com.bulbul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
//		System.out.println("hello");
		ApplicationContext cxt = SpringApplication.run(SpringBoot1Application.class, args);

//		Student s1 = new Student();
//		s1.blr();

		Student s1 = (Student) cxt.getBean(Student.class);
		s1.blr();

	}

}

//bean class 
//ioc container
//object return
