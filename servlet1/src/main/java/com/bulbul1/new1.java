package com.bulbul1;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class new1  extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res){		
		String a = req.getParameter("fname");
		String b = req.getParameter("pass");		
        System.out.println(a + "  " + b);
		
	    
	    
	}
}
