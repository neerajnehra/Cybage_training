package com.cybage;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

    public MyFilter() {
        //Constructor
    }

	public void destroy() {
		//Destructor
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//We can modify the request and response object.
		System.out.println(request.getServletContext().getContextPath());  	//To get your application name.
		System.out.println("Request going through filter." + " user name: " + request.getParameter("userName"));
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
