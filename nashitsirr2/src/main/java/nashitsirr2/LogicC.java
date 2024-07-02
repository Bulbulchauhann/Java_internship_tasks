package nashitsirr2;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogicC extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		int en = Integer.parseInt(req.getParameter("eng"));
		int ma = Integer.parseInt(req.getParameter("math"));
		int sc = Integer.parseInt(req.getParameter("sci"));
		double total = en + ma + sc;
		double per = total/3;
		
		HttpSession ses = req.getSession();
		ses.setAttribute("name", name);
		ses.setAttribute("age", age);
		ses.setAttribute("marks", per);
		
//		req.setAttribute("key", name);
//		req.setAttribute("marks", per);
		
		res.sendRedirect("pass");
		
//		RequestDispatcher rd = req.getRequestDispatcher("pass");
//		rd.forward(req, res);
		
//		System.out.println(name + " " + age + " " + marks);
		PrintWriter pw = res.getWriter();
		pw.print("<body bgColor='powderblue'>");
		pw.print("<h1>");
		pw.print("Hi, ");
		pw.print("</h1>");

		pw.print("<h1>");
		pw.print("Name : " + " " + name + "<br>");
		pw.print("</h1>");
		
		pw.print("<h1>");
		pw.print("Age : " + " " + age + "<br>");
		pw.print("</h1>");
		
		pw.print("<h1>");
		pw.print("Percentage : " + " " + per + "%" + "<br>");
		pw.print("</h1>");
//		pw.print("Marks : " + " " + marks + "<br>");
//		pw.print(per + "%");
		
		pw.print("</body>");
	}
}
