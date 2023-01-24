package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/student")
	public Student insertStudent(@RequestBody Student student) {
		Student savedStudent = studentService.saveStudent(student);
		return savedStudent;
	}

	@GetMapping("/getstudent")
	public List<Student> fetchStudentList() {
		return studentService.fetchStudentList();
	}

	@PutMapping("/student/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id") Integer id) {
		return studentService.updateStudent(student, id);
	}

	@DeleteMapping("/student/{id}")
	public String deleteStudentById(@PathVariable("id") Integer studentById) {
		studentService.deleteStudentById(studentById);
		return "Deleted Successfully";
	}
}