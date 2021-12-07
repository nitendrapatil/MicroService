package com.exmaple.model;

import java.util.List;

public class EmployeeInformation {
	
	private String employeeId;
	private String empName;
	private String empAddress;
	private String empEmailId;
	private List<WorkHistory> workHistoryList;
	private List<TechStack> techStackList;
	
	public EmployeeInformation(String employeeId, String empName, String empAddress, String empEmailId,List<WorkHistory> list, List<TechStack> teckList) {
		this.employeeId = employeeId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empEmailId = empEmailId;
		this.workHistoryList=list;
		this.techStackList=teckList;
		
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	public List<WorkHistory> getWorkHistoryList() {
		return workHistoryList;
	}
	public void setWorkHistoryList(List<WorkHistory> workHistoryList) {
		this.workHistoryList = workHistoryList;
	}
	public List<TechStack> getTechStackList() {
		return techStackList;
	}
	public void setTechStackList(List<TechStack> techStackList) {
		this.techStackList = techStackList;
	}
	
	

}
