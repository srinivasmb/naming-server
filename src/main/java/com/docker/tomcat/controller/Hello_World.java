package com.docker.tomcat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET }, allowedHeaders = "*")
@RestController
public class Hello_World {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String UserStatus(HttpServletRequest request, HttpServletResponse response) {
		return "Hello World User";

	}

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
}
