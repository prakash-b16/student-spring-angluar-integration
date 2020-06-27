package com.prk.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prk.main.model.StudentModel;
import com.prk.main.repository.StudentRepository;
import com.prk.main.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repo;

	@Override
	public String addStudent(StudentModel stu) {
		repo.save(stu).toString();
		return "Student Saved";
	}

	@Override
	public List<StudentModel> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public StudentModel getStudentById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public StudentModel updateData(StudentModel stu) {
		return repo.save(stu);
	}

	@Override
	public void deleteStudentById(int id) {
		repo.deleteById(id);
	}

	@Override
	public String addStudentsByArray(List<StudentModel> stulist) {
		repo.saveAll(stulist);
		return "All Students Saved";
	}

}
