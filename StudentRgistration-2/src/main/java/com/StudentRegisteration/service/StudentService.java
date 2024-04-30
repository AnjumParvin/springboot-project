package com.StudentRegisteration.service;
import java.util.List;

import com.StudentRegisteration.model.Student;
public interface StudentService
{
public String upsert(Student student); 
	
public  Student getById(Integer sid);

public List<Student>getAllStudents();

public String deleteById(Integer sid);

}
