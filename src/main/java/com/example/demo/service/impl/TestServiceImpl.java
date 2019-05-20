package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Student;
import com.example.demo.repository.TestRepository;
import com.example.demo.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestRepository testRepository;
	
	public List<Student> getAllStudent()
	{
		return testRepository.findAll();
	}
}