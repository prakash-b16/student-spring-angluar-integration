package com.prk.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prk.main.model.StudentModel;

@Repository
public interface StudentRepository extends CrudRepository<StudentModel, Integer> {

}
