package com.remindr.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class RootController extends HttpServlet {

	private static final long serialVersionUID = -5834628457261939423L;
	
	private Logger logger = Logger.getLogger(RootController.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Landing page visited from: " + req.getRemoteAddr());
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
