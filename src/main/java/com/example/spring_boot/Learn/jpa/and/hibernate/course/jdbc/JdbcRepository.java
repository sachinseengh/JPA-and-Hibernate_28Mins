package com.example.spring_boot.Learn.jpa.and.hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.spring_boot.Learn.jpa.and.hibernate.course.Courses;

@Repository
public class JdbcRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	private String Query =
			"""
			insert into course(id,name,author) values (?,?,?);
			
			""";
	
	private String DeleteQuery=
			"""
			delete from course where id =?;
			
			""";
	
	private String SelectQuery=
			"""
			select * from course where id =?
			""";
	
	public void insert(Courses course) {
		jdbcTemplate.update(Query,course.getId(),course.getName(),course.getAuthor());
	}
	
	
	public void deleteById(int id) {
		jdbcTemplate.update(DeleteQuery,id);
	}
	public Courses findById(int id) {
		return jdbcTemplate.queryForObject(SelectQuery,
				new BeanPropertyRowMapper<>(Courses.class)
				,id);
	}

}
