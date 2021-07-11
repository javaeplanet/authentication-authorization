package com.javaeplanet.auth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentNo;
	private String studentName;
	private String studentMarks;
	private String studentConduct;
	private String percentage;
	private String grade;

}
