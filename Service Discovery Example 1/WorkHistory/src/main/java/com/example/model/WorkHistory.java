package com.example.model;

public class WorkHistory {

	private String empId;
	private String companyName;
	private String duration;
	private String designation;

	public WorkHistory(String empId, String companyName, String duration, String designation) {
		this.empId = empId;
		this.companyName = companyName;
		this.duration = duration;
		this.designation = designation;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
