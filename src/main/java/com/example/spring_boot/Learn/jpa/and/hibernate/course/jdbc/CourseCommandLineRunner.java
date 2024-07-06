package com.example.spring_boot.Learn.jpa.and.hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private JdbcRepository repo;
	@Override
	public void run(String... args) throws Exception {
	
		repo.insert();
	}

}
