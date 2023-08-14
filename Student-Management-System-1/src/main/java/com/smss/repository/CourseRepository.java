package com.smss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smss.dto.CourseDTO;
import com.smss.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	List<CourseDTO> findByCategory(String category);  
	List<CourseDTO> findByName(String coursename);

}
