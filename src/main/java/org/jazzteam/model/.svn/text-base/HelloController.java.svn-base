package org.jazzteam.model;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
	protected static final Logger logger = Logger.getLogger(HelloController.class);

	@Override
	public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws Exception {
		logger.info("Returning hello view");
		System.out.println("stdout - Returning hello view");
		return new ModelAndView("hello.jsp");
	}
}
