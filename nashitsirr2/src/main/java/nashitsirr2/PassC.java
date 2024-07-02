package nashitsirr2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class PassC extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		String name;
//		String name = req.getParameter("name");
		
//		String name = (String)req.getAttribute("key");
//		double marks  = (double) req.getAttribute("marks");
		
		HttpSession ses = req.getSession();
		String name = (String) ses.getAttribute("name");
		int age = (int) ses.getAttribute("age");
		
		PrintWriter pw = res.getWriter();
		pw.println("<h1>" + name + ": passed " + age+ "</h1");
//		pw.println("<h1>" + name + " You have passed!" + " </h1>");
//    	pw.println("<h1>" + name + ", you have passed with : " + marks + "%" + "</h1>");
		
	}

}
