package com.web.microservices.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping(path = "/{userId}")
	public String getUsers(@PathVariable String userId) {
		return "Get users method called with userId: "+userId;
	}

	@PostMapping
	public String createUsers() {
		return "Create users method called";
	}

	@PutMapping
	public String updateUsers() {
		return "Update users method called";
	}

	@DeleteMapping
	public String deleteUsers() {
		return "Delete users method called";
	}
}
