package com.example.spring_boot.Learn.jpa.and.hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring_boot.Learn.jpa.and.hibernate.course.Courses;
import com.example.spring_boot.Learn.jpa.and.hibernate.course.jdbc.JdbcRepository;
import com.example.spring_boot.Learn.jpa.and.hibernate.course.jpa.CourseJPARepository;

@Component

public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private JdbcRepository repo;
	
	@Autowired
	private CourseJPARepository repo;
	
	@Override
	public void run(String... args) throws Exception {
	
		repo.insert(new Courses(1,"java-jpa","sachin"));
		repo.insert(new Courses(2,"php-jpa","singh"));
		repo.insert(new Courses(3,"python-jpa","kush"));
		
		
		repo.deleteById(1);
		System.out.println(repo.findById(2).getName());
		System.out.println(repo.findById(3).getName());
	}

}
