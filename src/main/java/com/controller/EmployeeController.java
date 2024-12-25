package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.EmployeeBean;
import com.config.Config;

public class EmployeeController {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ctx= new AnnotationConfigApplicationContext(Config.class);
		EmployeeBean emp =(EmployeeBean) ctx.getBean("emp");
		EmployeeBean emp2 =(EmployeeBean) ctx.getBean("emp");
		EmployeeBean emp3 =(EmployeeBean) ctx.getBean("emp");
		
		System.out.println(emp);
//		System.out.println(emp2);
//		System.out.println(emp3);
		emp.setId(101);
		System.out.println(emp);
		System.out.println(emp.getId());
		System.out.println(emp.getDate());
//		System.out.println(emp.getEmployeeDetail());
		
		emp.getEmployeeDetail().setAge(12);
		emp.getEmployeeDetail().setFirstName("raj");
		emp.getEmployeeDetail().setLastName("shah");
		
		System.out.println(emp.getEmployeeDetail().getAge());
		System.out.println(emp.getEmployeeDetail().getFirstName());
		System.out.println(emp.getEmployeeDetail().getLastName());
	
		
		
		ctx.close();
	}
}
