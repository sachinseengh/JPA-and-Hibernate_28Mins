package com.example.spring_boot.Learn.jpa.and.hibernate.course.springdataJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot.Learn.jpa.and.hibernate.course.Courses;

public interface SpringDataJPA  extends JpaRepository<Courses,Long>{

	
	List<Courses> findByAuthor(String author);
}
