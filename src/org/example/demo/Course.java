package org.example.demo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;


@Entity
@Table(name = "courses")
public class Course {
	
	@Id
	@GeneratedValue
	private int courseId;
	private String course_name;
	
	@ManyToMany
	private Collection<Student> studentList = new ArrayList();
		
	public Collection<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(Collection<Student> studentList) {
		this.studentList = studentList;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
}
