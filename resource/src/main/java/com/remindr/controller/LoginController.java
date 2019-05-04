package com.remindr.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 7087089239299080342L;
	
	private Logger logger = Logger.getLogger(LoginController.class.getName());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("Login page visited from: " + req.getRemoteAddr());
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}

}
