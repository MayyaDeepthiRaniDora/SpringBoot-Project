package com.smss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smss.dto.StudentDTO;
import com.smss.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	List<StudentDTO> findByAddress(String address);  
	List<StudentDTO> findByName(String name);


}
