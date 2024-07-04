package projP;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginservlet")

public class loginS extends HttpServlet{
	
	//authentication------------
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uname = req.getParameter("user");
		String pass = req.getParameter("pass");
		
		String username = "nashit";
		String password = "123abc";
		
		if (uname.equals(username) && pass.equals(password)) {
			
			HttpSession ses = req.getSession();
			ses.setAttribute("user", uname);
			res.sendRedirect("welcome.jsp");
		}
		else {
			res.sendRedirect("login.jsp");
		}		
	}
}
