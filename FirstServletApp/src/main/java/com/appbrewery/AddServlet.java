package com.appbrewery;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	

	
///doGetPost Method
	
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
	calculate(req,res);
		
	}

///doGetPost Method

public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	

	calculate(req,res);
	
}



/// Calculation Method

public void calculate(HttpServletRequest req, HttpServletResponse res) throws IOException {
	// TODO Auto-generated method stub
	
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
			
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int total = i + j;
		
		out.println("Total is : " + total);
		
}

///Service Method

//public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
//	
//	res.setContentType("text/html");
//	PrintWriter out = res.getWriter();
//	
//int i = Integer.parseInt(req.getParameter("num1"));
//int j = Integer.parseInt(req.getParameter("num2"));
//
//int total = i + j;
//
//	
//out.println("Total is : " + total);
//	
//}




}
