package com.practice.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.practice.entities.Student;

public class InsertImpl implements InsertInterf {
	private JdbcTemplate jdbcTemplate;

	@Override
	public String toString() {
		return "InsertImpl [jdbcTemplate=" + jdbcTemplate + "]";
	}

	public InsertImpl() {
		super();
		
	}

	public InsertImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		String sqlQuery = "insert into student(sName,sAddress) values(?,?)";
		int result = jdbcTemplate.update(sqlQuery,student.getsName(),student.getsAddress());
		return result;
	}

}
