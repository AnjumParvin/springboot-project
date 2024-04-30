package com.StudentRegisteration.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentRegisteration.model.Student;

public interface StudentRepository extends JpaRepository<Student,Serializable> {

}
