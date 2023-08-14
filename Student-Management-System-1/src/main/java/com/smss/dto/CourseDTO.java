package com.smss.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.smss.entity.Student;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Builder
@NoArgsConstructor
public class CourseDTO {
	private int id;
	@NotNull(message="Name of Student can never be null")
	@NotBlank(message="Name of Student can never be empty")
	@Size(min=3)
	private String name;
	@NotBlank(message="Category  can never be empty")
	private String category;
	private List<Student> studentList;
}
