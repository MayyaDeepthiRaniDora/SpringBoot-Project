package com.smss.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smss.dto.CourseDTO;
import com.smss.dto.StudentDTO;
import com.smss.entity.Course;

@Service
public interface CourseService {
	CourseDTO addCourse(Course course);
	 List<CourseDTO> getAllcourses();
	CourseDTO getCourseById(int id);
	
	 String deleteCourse(int id);
	 List<CourseDTO> getcourseBycategory(String category);  
	 List<CourseDTO> getcourseByName(String name);
}
