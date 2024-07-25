package in.nsti.bulbul.appmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.nsti.context.ConfigFile;

public class App {
	public static void main(String[] args) {
//        System.out.println( "Connected");
		try {
			ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
			JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);

//    	System.out.println("Connected");
//			String query = "Create database adit1";
//			jT.update(query);
//			System.out.println("Created Successfully");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
			
			//create table
			String query = "Create table student(name varchar(100) , mail varchar(100), phone varchar(100))";
			jT.update(query);
			System.out.println("Table created");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}