package org.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "students")
public class Student {
 
	@Id
	@GeneratedValue
	private int studentId;
	private String studentName;
	private String branch;
	
	@ManyToMany
    private Collection<Course> courseList = new ArrayList<Course>();	
  
	public Collection<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(Collection<Course> courseList) {
		this.courseList = courseList;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
