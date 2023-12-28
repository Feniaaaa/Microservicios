package com.microservice.student.microservicestudent.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.student.microservicestudent.entities.Student;

@Service
public interface IStudentService {
	List<Student> findall();
	Student findbyId(long id);
	void save(Student student);
	List<Student> findByIdCourse(Long idCourse);
}
