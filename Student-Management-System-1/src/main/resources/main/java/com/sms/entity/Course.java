package com.sms.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String category;
	
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Student_id")
	private Student student;
	@Builder
	public Course(int id, String name, String category,Student student) {
		super();
		this.id = id;
		this.name = name;
		this.category=category;
		this.student=student;
	}*/
	
	
	}

