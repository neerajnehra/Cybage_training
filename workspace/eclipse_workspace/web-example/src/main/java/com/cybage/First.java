package com.cybage;

 

import java.io.IOException;
import java.io.PrintWriter;

 

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

public class First extends HttpServlet {
    private static final long serialVersionUID = 1L;

 

    public First() {
        super();
    }

 

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.print("<h1>This is get method (firsT)</h1>");
        System.out.println("processing first servlet");

 

        // after getting on this servlet i want to go to second servlet
        // RequestDispatcher rd = request.getRequestDispatcher("Second");
        // rd.forward(request, response); //going to other resources(servlet, jsp)

 

        // if you want to go to outside application
        // response.sendRedirect("http://www.google.com");

 

    }

 

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.print("<h1>This is post method (first)</h1>");
        // reading data sent by users
        String username = request.getParameter("username");
        System.out.println("username from user(first): "+ username);
        
        ServletConfig config = getServletConfig();
        System.out.println("hotel address: "+ config.getInitParameter("address"));
        
        
        //getting servlet context information
        ServletContext context = getServletContext();
        System.out.println("org name : "+ context.getInitParameter("appname"));
        
//        RequestDispatcher rd = request.getRequestDispatcher("Second");
//        rd.forward(request, response);

 

    }

 

}