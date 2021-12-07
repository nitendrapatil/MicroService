package com.example.model;

public class TechStack {

	private String empId;
	private String stack;
	
	
	public TechStack(String empId, String stack) {
		this.empId = empId;
		this.stack = stack;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getStack() {
		return stack;
	}
	public void setStack(String stack) {
		this.stack = stack;
	}
	
	
}
