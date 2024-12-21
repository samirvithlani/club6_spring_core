package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.EmployeeBean;
import com.config.Config;

public class EmployeeController {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(Config.class);
		EmployeeBean emp =(EmployeeBean) ctx.getBean("emp");
		emp.setId(101);
		System.out.println(emp);
		System.out.println(emp.getId());
		System.out.println(emp.getDate());
	}
}
