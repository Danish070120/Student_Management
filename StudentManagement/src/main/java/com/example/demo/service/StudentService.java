package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	Student saveStudent(Student student);

	List<Student> fetchStudentList();

	Student updateStudent(Student student, Integer id);

	void deleteStudentById(Integer studentById);

}
