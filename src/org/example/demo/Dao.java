package org.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {
	
	public static void main(String[] args)
	{
		Course c1 = new Course();
		c1.setCourse_name("Physics");
		Course c2 = new Course();
		c2.setCourse_name("English");
		Course c3 = new Course();
		c3.setCourse_name("M1");
		Course c4 = new Course();
		c4.setCourse_name("Java");
		/* List<Course> course = new ArrayList<>();
		course.add(c1);
		course.add(c2);
		course.add(c3);
		course.add(c4); */
		
		Student s1 = new Student();
		s1.setStudentName("Harshata");
		s1.setBranch("CSE");
	    Student s2 = new Student();
	    s2.setStudentName("Akshata");
		s2.setBranch("IT");
		Student s3 = new Student();
		s3.setStudentName("Bhavishya");
		s3.setBranch("ECE");
        /*List<Student> student = new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        s1.setListofcourse(course);
        s2.setListofcourse(course);
        s3.setListofcourse(course); */
    
		c1.getStudentList().add(s1);
		c1.getStudentList().add(s2);
		c1.getStudentList().add(s3);

		c2.getStudentList().add(s1);
		c2.getStudentList().add(s2);
		c2.getStudentList().add(s3);

		c3.getStudentList().add(s1);
		c3.getStudentList().add(s2);
		c3.getStudentList().add(s3);

		c4.getStudentList().add(s1);
		c4.getStudentList().add(s2);
		
		s1.getCourseList().add(c1);
		s1.getCourseList().add(c2);
		s1.getCourseList().add(c3);
		s1.getCourseList().add(c4);
		
		s2.getCourseList().add(c1);
		s2.getCourseList().add(c2);
		s2.getCourseList().add(c3);
		s2.getCourseList().add(c4);
		
		s3.getCourseList().add(c1);
		s3.getCourseList().add(c2);
		s3.getCourseList().add(c3);

		Configuration con = new Configuration();
		con.configure();
		SessionFactory sef = con.buildSessionFactory();
		Session ses = sef.openSession();
	    ses.beginTransaction();
        ses.save(s1);
        ses.save(s2);
        ses.save(s3); 
        ses.save(c1);
        ses.save(c2);
        ses.save(c3);
        ses.save(c4);
        ses.getTransaction().commit();
        ses.close();
	}

}
