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

@WebServlet("/crud")

public class crudC extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String action = req.getParameter("action");
		String mail = req.getParameter("mail");

//    	 pw.println(action + "--" + mail);

		if ("update".equals(action)) {
			pw.print("update form: ");
			updateForm(res, mail);

		} else {
			try {
				delData(res, mail);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	private void updateForm(HttpServletResponse res, String mail) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		pw.println("<form action= 'crud' method='POST'>");
		pw.println("<input type='hidden' name = 'action' value = 'update' >");
		pw.println("<input type='text' name = 'user' placeholder= 'name' >");
		pw.println("<input type='text' name = 'mail' value = '" + mail + "' readonly>");
		pw.println("<input type='text' name = 'phone' placeholder= 'phone'>");
		pw.println("<input type='text' name = 'age' placeholder= 'age'>");
		pw.println("<input type='submit' value = 'update'>");
		pw.println("</form>");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String action = req.getParameter("action");
		if ("update".equals(action)) {
			updateData(req, res);
		}
	}

	public void updateData(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("user");
		String mail = req.getParameter("mail");
		String phone = req.getParameter("phone");
		String age = req.getParameter("age");

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm", "root", "2299");

			String query = "update student set name=?, phone=?, age=? where mail=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, phone);
			ps.setString(3, age);
			ps.setString(4, mail);

			int updated = ps.executeUpdate();
			if (updated > 0) {
				pw.println("Updated successfully");
			} else {
				pw.println("update failed");
			}

		} catch (ClassNotFoundException | SQLException e) {
			pw.println(e);
		}
	}

	public void delData(HttpServletResponse res, String mail) throws IOException, SQLException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm", "root", "2299");
			String query = "delete from student where mail=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, mail);
			int deleted = ps.executeUpdate();
			if (deleted > 0) {
				pw.println("deleted successfully");
			} else {
				pw.println("error while deleting");
			}

		} catch (ClassNotFoundException e) {
			pw.print(e);
		}
	}
}
