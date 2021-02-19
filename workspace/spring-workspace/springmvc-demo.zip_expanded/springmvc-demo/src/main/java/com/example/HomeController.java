package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getIndexPage() {
		return "index";					// http://localhost:8086/index.jsp
	}
	
	@GetMapping(path = "/home")
	public String getHomePage() {
		return "home";					// http://localhost:8086/home.jsp
	}
	
	@PostMapping(path = "/emp")
	public String getEmpPage() {
		return "emp";					// http://localhost:8086/emp.jsp
	}
}
