package com.smss.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.smss.dto.CourseDTO;
import com.smss.entity.Course;
import com.smss.repository.CourseRepository;
import com.smss.repository.StudentRepository;
import com.smss.service.CourseService;
import com.smss.util.CourseConverter;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	CourseRepository courseRepository;
	@Autowired
	CourseConverter courseConverter;
	@Autowired
	StudentRepository studentRepository;
	@Override
	public CourseDTO addCourse(Course course) {
		Course crs=courseRepository.save(course);	
		
		return courseConverter.convertToCourseDTO(crs);
	}

	@Override
	public List<CourseDTO> getAllcourses() {
		List<Course> courses=courseRepository.findAll();

		//list of DTO type
		List<CourseDTO> dtoList=new ArrayList<>();

		for(Course c:courses)
		{
			dtoList.add(courseConverter.convertToCourseDTO(c));
		}
		return dtoList;
		}
		
		
	@Override
	public CourseDTO getCourseById(int id) {
		Course course=courseRepository.findById(id).get();	
		return courseConverter.convertToCourseDTO(course);
	}

	

	@Override
	public String deleteCourse(int id) {
		courseRepository.deleteById(id);
		return "Course details got deleted successfully";
	}

	
	@Override
	public List<CourseDTO> getcourseBycategory(String category) {
		
		return courseRepository.findByCategory(category);
	}
	@Override
	public List<CourseDTO> getcourseByName(String name) {
		
		return courseRepository.findByName(name);
	}
	

}