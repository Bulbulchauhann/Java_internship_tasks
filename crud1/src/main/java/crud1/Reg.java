package crud1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")

public class Reg extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
			
   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm", "root", "2299");
		String name = req.getParameter("user");
		String mail = req.getParameter("mail");
		String phone = req.getParameter("phone");
		int age = Integer.parseInt(req.getParameter("age"));
		
		String query = "insert into student values(?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, name);
		ps.setString(2, mail);
		ps.setString(3, phone);
		ps.setInt(4, age);
		
		
		int inserted = ps.executeUpdate();
		if(inserted>0) {
			pw.println("Inserted Successfully");
		} else {		
		    pw.println("Not inserted");
	    }


	} catch (ClassNotFoundException | SQLException e) {
	   pw.print(e);
	}
	}
}
	