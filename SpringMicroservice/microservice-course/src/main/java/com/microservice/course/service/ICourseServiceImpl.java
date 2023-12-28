package com.microservice.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.course.DTO.StudentDTO;
import com.microservice.course.client.StudentClient;
import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentsByCourseResponse;
import com.microservice.course.repository.ICourseRepository;

@Service
public class ICourseServiceImpl implements ICourseService {
	
	@Autowired
	private ICourseRepository courseRepository;
	
	@Autowired
	private StudentClient studentClient;

	@Override
	public List<Course> findall() {
		return (List<Course>) courseRepository.findAll();
	}

	@Override
	public Course findbyId(long id) {
		return (Course) courseRepository.findById(id).orElseThrow();
	}

	@Override
	public void save(Course course) {
		courseRepository.save(course);
	}

	@Override
	public StudentsByCourseResponse findStudentsByIdCourse(Long idCourse) {
		Course course = courseRepository.findById(idCourse).orElse(new Course());
		
		List<StudentDTO> studentDTOList =  studentClient.findAllStudentByCourse(idCourse);
		
		return StudentsByCourseResponse.builder()
				.courseName(course.getName())
				.teacher(course.getTeacher())
				.studentDTOList(studentDTOList)
				.build();
	}

}
