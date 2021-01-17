package org.bit.ite3742.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bit.ite3742.domain.Student;
import org.bit.ite3742.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	private static List<Student> students = new ArrayList<>();
	
	static {
		students.add(new Student(1, "Dewmi", "Galabada", 26));
		students.add(new Student(2, "Lakshi", "Mendis", 25));
		students.add(new Student(3, "Shashihi", "WVA", 24));
		students.add(new Student(4, "Tharindi", "Fernando", 23));
		students.add(new Student(5, "Ushara", "Pasindu", 22));
		students.add(new Student(6, "Vidushika", "MS", 21));
		students.add(new Student(7, "Viraj", "Piumal", 20));
	}

	@Override
	public List<Student> getAll() {
		return students;
	}

	@Override
	public Student getById(int id) {
		Optional<Student> student = students.stream().filter(s -> s.getId() == id).findFirst();
		return student.orElse(null);
	}

	@Override
	public void save(Student student) {
		Student oldStudent = getById(student.getId());
		if (oldStudent == null) {
			students.add(student);
		}				
	}
}
