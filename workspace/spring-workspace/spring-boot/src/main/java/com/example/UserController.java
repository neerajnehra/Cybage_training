package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/users")
public class UserController {
	List<User> users;
	{
		users = new ArrayList<User>();
		users.add(new User(10, "user1"));
		users.add(new User(11, "user2"));
		users.add(new User(12, "user3"));
		users.add(new User(13, "user4"));
		users.add(new User(14, "user5"));
	}

	@RequestMapping
	public ResponseEntity<List<User>> getUsers() {
		return ResponseEntity.status(HttpStatus.FOUND).body(users);
	}

	@RequestMapping("/{id}")
	public User getUsers(@PathVariable int id) {
		Optional<User> usr = users.stream().filter(u -> u.getId() == id).findFirst();
		
		return usr.get();
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public String postUser(@RequestParam User user) {
		// @requestbody --> data from request will be mapped to user object
		users.add(user);
		return "successfully added record";
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id) {
		boolean isDeleted = users.removeIf(u -> u.getId() == id); // java 8
		if (isDeleted) {
			return ResponseEntity.status(HttpStatus.OK).body("deleted record");
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("could not delete record because it is not present in db");
		}
	}

	@PutMapping("/{id}")
	public String updateUser(@RequestParam User user, @PathVariable int id) {
		users.removeIf(u -> u.getId() == id); // java 8
		users.add(user);
		return "successfully update record...";
	}
}
