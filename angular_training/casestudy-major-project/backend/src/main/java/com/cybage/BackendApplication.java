package com.cybage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cybage.model.Users;
import com.cybage.repository.UserRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Autowired
	UserRepository ur;
	
	@Override
	public void run(String... args) throws Exception {
		ur.save(new Users(11,"user1", "pass", "user"));
		ur.save(new Users(12,"user2", "pass", "user"));
		ur.save(new Users(13,"user3", "pass", "user"));
		ur.save(new Users(14,"admin1", "pass", "admin"));		
		ur.save(new Users(15,"admin2", "pass", "admin"));
	}
	
}
