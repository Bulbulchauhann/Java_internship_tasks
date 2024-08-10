package in.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.StudentC;

@Configuration
public class Config1 {
	@Bean
	public StudentC patna1() {
		StudentC s1 = new StudentC();
		s1.setName("shrey");
		s1.setMail("Shreyyy@yahoo.com");
		s1.setAge("23");
		
		return s1;	          
	}
}
