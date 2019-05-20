package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Student;
import com.example.demo.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService testService;
	
	@GetMapping("/backend")
	public String backend() {
		System.out.println("Inside MyRestController::backend...");

		return "Hello form Backend!!! " + " Host : localhost " + " :: Port : " ;
	}
	
	@GetMapping("/getAllAdmission")
	public List<Student> getAllAdmission() {

		//return null;
		return testService.getAllStudent();
	//	System.out.println("Inside Put Admission");

	}
}
