package nashitsirr2;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

//import jakarta.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")

public class LogicC extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		int en = Integer.parseInt(req.getParameter("eng"));
		int ma = Integer.parseInt(req.getParameter("math"));
		int sc = Integer.parseInt(req.getParameter("sci"));
		double total = en + ma + sc;
		double per = total / 3;

		//request dispatcher(1st way)--------------------------------------------------
		req.setAttribute("key", name); // req dispatcher
		req.setAttribute("marks", per);// req dispatcher

		RequestDispatcher rd = req.getRequestDispatcher("pass"); // req dispatcher
		rd.forward(req, res); // req dispatcher

//		response redirect(2nd way)-----------------------------------------------------
//		res.sendRedirect("pass"); //response redirect
//		res.sendRedirect("pass?key="+ name); //response redirect
		
//		http session (3rd way)---------------------------------------------------------
//		HttpSession ses = req.getSession(); //hs
//		ses.setAttribute("name", name); //hs
//		ses.setAttribute("age", age);//hs
//		ses.setAttribute("marks", per); //hs

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
