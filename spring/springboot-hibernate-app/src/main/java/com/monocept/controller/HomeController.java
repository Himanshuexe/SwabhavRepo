package com.monocept.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/home")
@RestController
public class HomeController {

	public HomeController() {
		System.out.println("Home Controller Created");
	}

	@GetMapping
	public String get() {
		return "get method is called";
	}

	@PostMapping
	public String post() {
		return "post method is called";
	}

	@PutMapping
	public String put() {
		return "put method is Called";
	}

	@DeleteMapping
	public String delete() {
		return "delete method is called";
	}
}
