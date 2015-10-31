package com.example.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@RequestMapping("/")
	public String hello() {
		return "hello world";
	}
}
