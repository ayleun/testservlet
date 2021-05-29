package com.montestServlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServeletCtr
 */
@WebServlet("/ServeletCtr")
public class ServeletCtr extends HttpServlet {
	private static final long serialVersionUID = 1L;

   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			
		String Login=request.getParameter("login");	
		String password=request.getParameter("password");
		
		System.out.println(Login);
		System.out.println(password);
			
		if(Login.equals("admin") && password.equals("admin")) {
		
			//response.sendRedirect("home.jsp");
			request.setAttribute("key", " Salam Monsieur");
			RequestDispatcher  requestDispatcher;
			requestDispatcher = request.getRequestDispatcher("/home.jsp");
			requestDispatcher.forward(request , response);
			
		}else {
			
			//response.sendRedirect("index.jsp");
			request.setAttribute("key", " Erreur");
			RequestDispatcher  requestDispatcher;
			requestDispatcher = request.getRequestDispatcher("/index.jsp");
			requestDispatcher.forward(request , response);
	}
	
		
	}	
	
}

