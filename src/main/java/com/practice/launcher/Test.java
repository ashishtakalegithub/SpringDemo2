package com.practice.launcher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.dao.InsertImpl;
import com.practice.entities.Student;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		InsertImpl insertStudent = applicationContext.getBean("insert", InsertImpl.class);
		Student student1 = new Student();
		student1.setsName("Ashish");
		student1.setsAddress("Pune");
		int result = insertStudent.insert(student1);
		System.out.println("Record updated::" + result);
	}

}
