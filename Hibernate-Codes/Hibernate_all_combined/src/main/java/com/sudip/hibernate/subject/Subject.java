package com.sudip.hibernate.subject;

import com.sudip.hibernate.student.TA;

public class Subject {

	private int subject_id;
	private String subject_name;
	private String professor;
	private TA ta;

	public Subject() {
	}

	public Subject(String subject_name, String professor, TA ta) {
		super();
		this.subject_name = subject_name;
		this.professor = professor;
		this.ta = ta;
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public TA getTa() {
		return ta;
	}

	public void setTa(TA ta) {
		this.ta = ta;
	}
	

}
