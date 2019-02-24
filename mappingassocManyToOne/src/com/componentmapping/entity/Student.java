package com.componentmapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "STUDENT_SEQ")
	@Column(name = "STUDENT_ID")
	private int studentId;

	@Column(name = "STUDENT_NAME")
	private String studentName;

	@ManyToOne
	@JoinColumn(name = "GUIDE_ID")
	private Guide guide;

	public Student() {
		super();
	}

	public Student(String studentName, Guide guide) {
		super();
		this.studentName = studentName;
		this.guide = guide;
	}

	@Override
	public String toString() {
		return "Student Details are \nStudent Id: " + studentId + " and Student Name: " + studentName
				+ " \n\nGuide Details are " + guide;
	}

}
