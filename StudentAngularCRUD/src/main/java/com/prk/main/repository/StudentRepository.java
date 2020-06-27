package com.prk.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prk.main.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

}
