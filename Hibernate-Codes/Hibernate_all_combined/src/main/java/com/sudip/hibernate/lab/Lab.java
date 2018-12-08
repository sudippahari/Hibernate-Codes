package com.sudip.hibernate.lab;

public class Lab {

	private int lab_id;
	private String lab_name;
	private String supervisor;

	public Lab() {
	}

	public Lab(String lab_name, String supervisor) {
		super();
		this.lab_name = lab_name;
		this.supervisor = supervisor;
	}

	public int getLab_id() {
		return lab_id;
	}

	public void setLab_id(int lab_id) {
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

	public String toString(){
		return Integer.toString(lab_id);
	}
}
