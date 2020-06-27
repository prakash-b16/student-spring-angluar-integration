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
import org.springframework.web.bind.annotation.RestController;

import com.prk.main.model.StudentModel;
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
	
	// add new student record
	@PostMapping(value = "/addnewstu")
	public String addNewStudent(@RequestBody StudentModel stu) {
		String saved = service.addStudent(stu);
		return saved;
	}
	
	// all students from array
	@PostMapping(value = "/addallstu")
	public String addStudentsByArray(@RequestBody List<StudentModel> stulist) {
		String saved = service.addStudentsByArray(stulist);
		return saved;
	}
	
	// get all student records
	@GetMapping(value = "/getallstu")
	public List<StudentModel> getAllStudents() {
		List<StudentModel> studentList = service.getAllStudents();
		return studentList;
	}
	
	// get student by it's id number
	@GetMapping(value = "/getstu/{id}")
	public StudentModel getStudent(@PathVariable("id") int id) {
		StudentModel stu = service.getStudentById(id);
		return stu;
	}	
	
	// edit student data
	@PutMapping(value = "/updatestu")
	public StudentModel editStudentData(@RequestBody StudentModel stu) {
		StudentModel stu1 = service.updateData(stu);
		return stu1;
	}
	
	// delete student record
	@DeleteMapping(value = "/deletestu/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		String deleted = service.deleteStudentById(id);
		return deleted;
	}
}
