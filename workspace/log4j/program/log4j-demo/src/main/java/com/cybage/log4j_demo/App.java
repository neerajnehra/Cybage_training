package com.cybage.log4j_demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	public static final Logger log =  LogManager.getLogger(App.class.getName()); 
	public static void main( String[] args ){
		log.info("My logger is working.");
		log.error("My logger is working.");
		log.warn("My logger is working.");
		log.trace("My logger is working.");
		log.fatal("My logger is working.");
		log.info("My logger is working.");
		log.info("My logger is working.");
		log.info("My logger is working.");
		log.info("My logger is working.");
		
	}
}
