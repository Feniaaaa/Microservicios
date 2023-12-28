package com.microservice.student.microservicestudent.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.student.microservicestudent.Repository.StudentRepository;
import com.microservice.student.microservicestudent.entities.Student;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findall() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student findbyId(long id) {
		return (Student) studentRepository.findById(id).orElseThrow();
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	public List<Student> findByIdCourse(Long idCourse) {
		return studentRepository.findAllByStudent(idCourse);
	}
	
}
