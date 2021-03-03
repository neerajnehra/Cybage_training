package com.cybage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Users;
import com.cybage.repository.UserRepository;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
	
	@Autowired
	UserRepository ur;

	
	@GetMapping
	public List<Users> getAllUsers() {
		return ur.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Users> getUserById(@PathVariable int id) {
		return ur.findById(id);
	}
	
	@PostMapping
	public String addUser(@RequestBody Users user) {
		ur.save(user);
		return "Successfully added user.";
	}
	
	@PutMapping
	public String udpateUser(@RequestBody Users user) {
		ur.save(user);
		return "Successfully updated user.";
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable int id){
		ur.deleteById(id);
		return "Successfully deleted user.";
	}
}