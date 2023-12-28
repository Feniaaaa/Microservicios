package com.microservice.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentsByCourseResponse;

@Service
public interface ICourseService {
	List<Course> findall();
	Course findbyId(long id);
	void save(Course course);
	StudentsByCourseResponse findStudentsByIdCourse(Long idCourse);
}
