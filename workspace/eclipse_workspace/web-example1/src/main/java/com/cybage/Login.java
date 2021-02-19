package com.cybage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if(userName.equals("admin") && password.equals("admin")) {
			//Create a session.
			HttpSession session = request.getSession();
			session.setAttribute("userName", "admin");
			//if success then go to welcome.jsp.
			request.getRequestDispatcher("/welcome.jsp").forward(request, response);
		}else {
			//If failure then go to index.jsp
			response.setContentType("text/html;charset=UTF-8");
			pw.print("<h2 color=red>Incorrect Password.</h2>");
			request.getRequestDispatcher("/index.jsp").include(request, response);;
		}
	}

}
