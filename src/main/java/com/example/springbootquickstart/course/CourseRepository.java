package com.example.springbootquickstart.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	//Just declare the method with the findBy{Property} name format, and Spring Data JPA will implements the method for you.
	public List<Course> findByTopicId(String topicId);

}
