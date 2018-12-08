package com.sudip.hibernate.student;

public class Student {

	private int student_id;
	private String student_name;
	private String student_address;
	private int student_age;

	public Student() {
	}

	public Student(String student_name, String student_address, int student_age) {
		super();
		this.student_name = student_name;
		this.student_address = student_address;
		this.student_age = student_age;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	public int getStudent_age() {
		return student_age;
	}

	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}

}
