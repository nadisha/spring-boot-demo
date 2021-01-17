package org.bit.ite3742.restapi;

import java.util.List;

import org.bit.ite3742.domain.Student;
import org.bit.ite3742.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentRESTApi {

	@Autowired
	private StudentService service;	
	
	/* GET /api/v1/students */
	@GetMapping()
	public List<Student> getStudents() {
		return service.getAll();
	}
	
	
	/* GET /api/v1/students/{id} */
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getById(id);
	}
	
	/* POST /api/v1/students */
	@PostMapping
	public void createStudent(@RequestBody Student student) {
		service.save(student);
	}
	
}
