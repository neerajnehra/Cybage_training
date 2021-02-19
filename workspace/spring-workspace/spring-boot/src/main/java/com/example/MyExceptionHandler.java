package com.example;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

		@ExceptionHandler(value = ArithmeticException.class)
		public String handleException(ArithmeticException ex) {
			return "Wrong process: " + ex.getLocalizedMessage();
		}
		
		@ExceptionHandler(value = UserException.class)
		public String handleUserException(Exception ex) {
			return "Wrong process: " + ex.getLocalizedMessage();
		}
		
}
