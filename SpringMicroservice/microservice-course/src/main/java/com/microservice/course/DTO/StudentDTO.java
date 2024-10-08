package com.microservice.course.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
	
	private String name;
	private String lastname;	
	private String email;
	private long courseId;
}
