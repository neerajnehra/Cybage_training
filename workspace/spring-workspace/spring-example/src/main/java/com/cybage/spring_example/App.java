package com.cybage.spring_example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws Exception {
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// Above is used for configuration using beans.xml

		//ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		 //Employee e = context.getBean("emp", Employee.class);
		 
		/*
		 * System.out.println("Emp object not needed.");
		 * 
		 * Thread.sleep(5 * 1000);
		 * 
		 * 
		 * System.out.println("Now i need emp object");
		 */
		 System.out.println(context.getBean("emp", Employee.class));
	}

}
