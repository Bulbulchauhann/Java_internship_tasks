package conn;
import java.sql.*;

public class conn1 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String user = "root";
		String pass = "";
		try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "2299");
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		Statement st = conn.createStatement();
		System.out.println("Connected");	
		
	}

}
 