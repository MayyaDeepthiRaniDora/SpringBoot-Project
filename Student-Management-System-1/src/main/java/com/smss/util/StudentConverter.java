package com.smss.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.smss.dto.StudentDTO;
import com.smss.entity.Student;

@Component
public class StudentConverter {
	//converting DTO to entity
	public Student convertToCourseEntity(StudentDTO studentDTO )
	{
		Student student=new Student();
		if(studentDTO!=null)
		{
			BeanUtils.copyProperties(studentDTO,student );
		}
		return student;
	}
		//converting  entity to DTO
				public StudentDTO convertToStudentDTO(Student student)
				{
					StudentDTO studentDTO=new StudentDTO();
					if(student!=null)
					{
						BeanUtils.copyProperties(student,studentDTO );
					}
					return studentDTO;

				
	}

}
