package com.sudip.hibernate.student;

import java.util.HashSet;
import java.util.Set;

import com.sudip.hibernate.subject.Subject;

public class TA extends Student {
	private Set<Subject> subjects = new HashSet<Subject>();
	private String available_day;

	public TA() {
	}

		public String getAvailable_day() {
		return available_day;
	}

	public void setAvailable_day(String available_day) {
		this.available_day = available_day;
	}

	
	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

}
