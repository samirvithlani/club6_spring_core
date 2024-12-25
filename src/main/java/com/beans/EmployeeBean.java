package com.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
//@Scope(scopeName = "prototype")//singleton...
public class EmployeeBean {

	private int id;
	private String name;
	@Autowired
	private Date date;

	@Autowired
	private EmployeeDetail employeeDetail; //null

	public EmployeeDetail getEmployeeDetail() {
		return employeeDetail;
	}

	public void setEmployeeDetail(EmployeeDetail employeeDetail) {
		this.employeeDetail = employeeDetail;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@PostConstruct
	public void startServer() {

		System.out.println("spring container hasbeen started...");
	}

	@PreDestroy
	public void stopServer() {

		System.out.println("server stoped...");
	}

}
