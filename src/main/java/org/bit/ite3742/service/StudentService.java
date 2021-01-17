package org.bit.ite3742.service;

import java.util.List;

import org.bit.ite3742.domain.Student;

public interface StudentService {
	
	List<Student> getAll();
	
	Student getById(int id);
	
	void save(Student student);
}
