package crud1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")

public class Display1 extends HttpServlet{
     @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	 
    	 res.setContentType("text/html");
    	 PrintWriter pw = res.getWriter();
    	 
    	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
    	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm", "root", "2299");
    	 Statement st = conn.createStatement();
    	 String query = "select * from student";
    	 ResultSet rs = st.executeQuery(query);
    	 
    	 pw.println("<html><body>");
         pw.println("<h2>Student Data</h2>");
         pw.println("<table border='1'><tr><th>Name</th><th>Email</th><th>Phone</th><th>Age</th><th>Operation</th></tr>");
         
         
    	 
    	 while(rs.next()) {
    		 String name = rs.getString(1);
    		 String mail = rs.getString(2);
    		 String phone = rs.getString(3);
    		 int age = rs.getInt(4);
    		 
//    		 pw.println(name);
    		 pw.println("<tr><td>" + name + "</td><td>" + mail + "</td><td>" + phone + "</td><td>" + age + "</td>");
    		 pw.println("<td><a href = 'crud?action=update&mail="+mail+"'>Update</a> | <a href = 'crud?action=delete&mail="+mail+"'>Delete</a></td></tr>");
    	 } 	   	 
    	 
    	 
    	 } catch (ClassNotFoundException | SQLException e) {
 			
 			e.printStackTrace();
 		}
    	
    }
}
