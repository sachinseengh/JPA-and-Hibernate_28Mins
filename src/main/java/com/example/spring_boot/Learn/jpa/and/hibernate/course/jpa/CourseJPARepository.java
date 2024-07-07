package com.example.spring_boot.Learn.jpa.and.hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.spring_boot.Learn.jpa.and.hibernate.course.Courses;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {
	
//	@Autowired
//	Better than autowired
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void insert(Courses course) {
		entityManager.merge(course);
	}
	
	
	public Courses findById(int id) {
		return entityManager.find(Courses.class,id);
	}
	
	public void deleteById(int id) {
		Courses course = entityManager.find(Courses.class, id);
		entityManager.remove(course);
	}
	
	

}
