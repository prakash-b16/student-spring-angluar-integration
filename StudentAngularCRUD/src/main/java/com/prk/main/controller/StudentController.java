package com.prk.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prk.main.service.StudentService;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/stu")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping(value = "/")
	public String mainPage() {
		return "Project is Working!";
	}
	
}
