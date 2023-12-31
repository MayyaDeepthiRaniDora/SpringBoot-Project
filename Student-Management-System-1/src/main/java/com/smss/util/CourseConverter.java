package com.smss.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.smss.dto.CourseDTO;
import com.smss.entity.Course;

@Component
	public class CourseConverter {
		//converting DTO to entity
		public Course convertToCourseEntity(CourseDTO courseDTO)
		{
			Course course=new Course();
			if(courseDTO!=null)
			{
				BeanUtils.copyProperties(courseDTO,course );
			}
			return course;

		}
		//converting  entity to DTO
		public CourseDTO convertToCourseDTO(Course course)
		{
			CourseDTO courseDTO=new CourseDTO();
			if(course!=null)
			{
				BeanUtils.copyProperties(course,courseDTO );
			}
			return courseDTO;

		}



	}

