package com.prk.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prk.main.model.StudentModel;
import com.prk.main.service.StudentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	// main page or base page 
	@RequestMapping(value = "/")
	public String mainPage() {
		return "Project is Working!";
	}
	
	// add new student record
	@PostMapping(value = "/addnewstu")
	public void addNewStudent(@RequestBody StudentModel stu) {
		service.addStudent(stu);
	}
	
	// all students from array
	@PostMapping(value = "/addallstu")
	public String addStudentsByArray(@RequestBody List<StudentModel> stulist) {
		String saved = service.addStudentsByArray(stulist);
		return saved;
	}
	
	// get all student records
	@GetMapping(value = "/getallstu")
	public Iterable<StudentModel> getAllStudents() {
		Iterable<StudentModel> studentList = service.getAllStudents();
		return studentList;
	}
	
	// get student by it's id number
	@GetMapping(value = "/getstu/{id}")
	public StudentModel getStudent(@PathVariable("id") int id) {
		return service.getStudentById(id);
	}	
	
	// edit student data
	@PutMapping(value = "/updatestu")
	public StudentModel editStudentData(@RequestBody StudentModel stu) {
		StudentModel stu1 = service.updateData(stu);
		return stu1;
	}
	
	// delete student record
	@DeleteMapping(value = "/deletestu/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		System.out.println("delete method called");
		service.deleteStudentById(id);
	}
}
