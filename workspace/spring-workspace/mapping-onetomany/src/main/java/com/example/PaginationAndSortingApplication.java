package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaginationAndSortingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PaginationAndSortingApplication.class, args);
	}

	@Autowired
	EmployeeRepository er;

	@Autowired
	AccountRepository ar;

	@Override
	public void run(String... args) throws Exception {
		Account account1 = new Account();
		account1.setAccountName("account1");
		
		Account account2 = new Account();
		account2.setAccountName("account2");
		
		List<Account> accounts = new ArrayList<>();
		accounts.add(account1);
		accounts.add(account2);
		
		
		
	}

}
