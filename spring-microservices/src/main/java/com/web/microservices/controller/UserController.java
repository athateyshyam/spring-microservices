package com.web.microservices.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping
	public String getUsers() {
		return "Get users method called";
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
