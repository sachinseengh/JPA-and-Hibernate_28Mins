package com.example.spring_boot.Learn.jpa.and.hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	private String Query =
			"""
			insert into course values (3,'java','sachin');
			
			""";
	
	public void insert() {
		jdbcTemplate.update(Query);
	}
	

}
