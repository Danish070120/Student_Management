package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		return student;
	}

	@Override
	public List<Student> fetchStudentList() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student, Integer id) {

		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Integer studentById) {
		studentRepository.deleteById(studentById);

	}

}
