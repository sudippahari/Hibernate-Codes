package com.sudip.hibernate.student;

import com.sudip.hibernate.lab.Lab;

public class RA extends Student {

	private String research_area;
	private Lab lab_id;
	private String lab_name;
	private String supervisor;

	public RA() {
	}

	public String getResearch_area() {
		return research_area;
	}

	public void setResearch_area(String research_area) {
		this.research_area = research_area;
	}

	public Lab getLab_id() {
		return lab_id;
	}

	public void setLab_id(Lab lab_id) {
		this.lab_id = lab_id;
	}

	public String getLab_name() {
		return lab_name;
	}

	public void setLab_name(String lab_name) {
		this.lab_name = lab_name;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

}
