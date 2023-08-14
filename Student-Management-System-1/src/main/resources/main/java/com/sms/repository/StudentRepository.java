package com.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.dto.StudentDTO;
import com.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	List<StudentDTO> findByAddress(String address);  
	List<StudentDTO> findByName(String name);


}
