package com.example.spring_boot.Learn.jpa.and.hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring_boot.Learn.jpa.and.hibernate.course.Courses;
import com.example.spring_boot.Learn.jpa.and.hibernate.course.jdbc.JdbcRepository;
import com.example.spring_boot.Learn.jpa.and.hibernate.course.jpa.CourseJPARepository;
import com.example.spring_boot.Learn.jpa.and.hibernate.course.springdataJpa.SpringDataJPA;

@Component

public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private JdbcRepository repo;
	
//	@Autowired
//	private CourseJPARepository repo;
	
	
	@Autowired
	private SpringDataJPA repo;
	
	@Override
	public void run(String... args) throws Exception {
	
		//for Jpa and jdbc template
//		repo.insert(new Courses(1,"java-jpa","sachin"));
//		repo.insert(new Courses(2,"php-jpa","singh"));
//		repo.insert(new Courses(3,"python-jpa","kush"));
//		
//		
//		repo.deleteById(1);
//		System.out.println(repo.findById(2).getName());
//		System.out.println(repo.findById(3).getName());
		
		
		//Spring Data JPA
		repo.save(new Courses(1l,"java-springDatajpa","sachin"));
		repo.save(new Courses(2l,"java-SpringDatajpa","sachin"));
		repo.save(new Courses(3l,"java-SpringDatajpa","sachin"));
		
		
		repo.deleteById(1l);
		System.out.println(repo.findById(2l));
		System.out.println(repo.findAll());
		System.out.println(repo.count());
		
		System.out.println(repo.findByAuthor("sachin"));
		System.out.println(repo.findByAuthor(""));
		
	}

}
