package com.microservice.student.microservicestudent.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.student.microservicestudent.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository <Student,Long> {
	
	@Query("SELECT s FROM Student s where s.courseId = :idCourse")
	List<Student> findAllByStudent(long idCourse);
	
	//List<Student> findAllByCourseId(long idCourse);
}
