package com.prk.main.service;

import java.util.List;

import com.prk.main.model.StudentModel;

public interface StudentService {

	String addStudent(StudentModel stu);

	List<StudentModel> getAllStudents();

	StudentModel getStudentById(int id);

	StudentModel updateData(StudentModel stu);

	void deleteStudentById(int id);

	String addStudentsByArray(List<StudentModel> stulist);

}
