package com.web.microservices.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "50") int limit,
			@RequestParam(value = "sort", defaultValue = "desc", required = false) String sort) {
		return "Get users method called with page = " + page + " and limit = " + limit+" sort = "+sort;
	}

	@GetMapping(path = "/{userId}")
	public String getUser(@PathVariable String userId) {
		return "Get users method called with userId: " + userId;
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
