package com.example.spring_boot.Learn.jpa.and.hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring_boot.Learn.jpa.and.hibernate.course.Courses;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private JdbcRepository repo;
	@Override
	public void run(String... args) throws Exception {
	
		repo.insert(new Courses(1,"java","sachin"));
		repo.insert(new Courses(2,"php","singh"));
		repo.insert(new Courses(3,"python","kush"));
		
		
		repo.deleteById(1);
		System.out.println(repo.findById(2).getName());
		System.out.println(repo.findById(3).getName());
	}

}
