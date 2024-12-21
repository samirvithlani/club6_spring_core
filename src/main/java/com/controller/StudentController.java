package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.beans.StudentBean;

public class StudentController {

	public static void main(String[] args) {
		
		//container...
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/ApplicationContext.xml");
		StudentBean studentBean1 = (StudentBean)ctx.getBean("stu");
		
		System.out.println(studentBean1);
		System.out.println(studentBean1.getId());
		
		System.out.println(studentBean1.getDate());
		
		
	}
}
