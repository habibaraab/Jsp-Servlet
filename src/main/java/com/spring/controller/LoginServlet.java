package com.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp")
		.forward(request, response);
		
	}
	

}
