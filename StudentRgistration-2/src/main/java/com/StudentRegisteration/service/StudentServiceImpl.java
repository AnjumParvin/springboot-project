package com.StudentRegisteration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentRegisteration.model.Student;
import com.StudentRegisteration.repo.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
     @Autowired
	private StudentRepository studentRepo;
	@Override
	public String upsert(Student student) {
		studentRepo.save(student);//upsert(insert/update based on PK)
		return "success";
	}

	@Override
	public Student getById(Integer sid) {
	Optional<Student>findById	=studentRepo.findById(sid);
	if(findById.isPresent()) {
		return findById.get();
	}
	return null;
	}
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

	@Override
	public String deleteById(Integer sid) {
		if(studentRepo.existsById(sid)) {
		studentRepo.deleteById(sid);
		return"Delete success";
	}else {
		return "No Record Found";
	}
	}	
}