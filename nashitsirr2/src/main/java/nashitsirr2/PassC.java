package nashitsirr2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;

@WebServlet("/pass")

public class PassC extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//Request Dispatcher		
		String name = (String)req.getAttribute("key"); //RequestDispatcher 
		double marks  = (double) req.getAttribute("marks"); //RequestDispatcher
		
//		//Response Redirect
//		String name; //redirect response
//		String name = req.getParameter("name"); /redirect response	
		
//		//Http Session		
//		HttpSession ses = req.getSession(); //http session
//		String name = (String) ses.getAttribute("name"); //http session
//		int age = (int) ses.getAttribute("age"); //http session
		
		PrintWriter pw = res.getWriter();
		pw.println("<h1>" + name + ", you have passed with : " + marks + "%" + "</h1>"); //request dispatcher
//		pw.println("<h1>" + name + " You have passed!" + " </h1>"); //redirect
//		pw.println("<h1>" + name + ": passed " + age+ "</h1"); //http session

    	
		
	}

}
