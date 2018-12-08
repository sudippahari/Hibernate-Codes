package com.sudip.hibernate.Manager;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sudip.hibernate.lab.Lab;
import com.sudip.hibernate.student.RA;
import com.sudip.hibernate.student.Student;
import com.sudip.hibernate.student.TA;
import com.sudip.hibernate.subject.Subject;

public class InsertStudent {

	public static void main(String[] args) {

		GetSession gs = new GetSession();
		Session s = gs.getSession();
		Transaction tx = s.beginTransaction();

		// insert students
		Student s1 = new Student("Dikshya Adhikari", "Denton, Texas", 25);
		Student s2 = new Student("Dipti Lohani", "Denton, Texas", 26);
		s.save(s1);
		s.save(s2);

		// TA students
		TA t1 = new TA();
		t1.setStudent_name("Sudip Pahari");
		t1.setStudent_address("Denton, Texas");
		t1.setStudent_age(27);
		t1.setAvailable_day("Monaday");

		TA t2 = new TA();
		t2.setStudent_name("Sandeep Neupane");
		t2.setStudent_address("Denton, Texas");
		t2.setStudent_age(25);
		t2.setAvailable_day("Wednesday");

		// insert subjects
		Subject sub1 = new Subject("Compiler Design", "Barrett Bryant", t1);
		Subject sub2 = new Subject("Basics of Data Structure", "Ryan Michaels", t1);
		Subject sub3 = new Subject("Computer Programming in C", "Mark Thmopson", t2);
		Subject sub4 = new Subject("Programming Language", "Bill Buckles", t2);

		// set of subjects
		Set<Subject> subjects1 = new HashSet<Subject>();
		Set<Subject> subjects2 = new HashSet<Subject>();
		subjects1.add(sub1);
		subjects1.add(sub2);
		subjects2.add(sub3);
		subjects2.add(sub4);

		// add subject sets to associated TAs
		t1.setSubjects(subjects1);
		t2.setSubjects(subjects2);

		s.save(t1);
		s.save(t2);

		// Lab names
		Lab l1 = new Lab("COVIS Lab", "Dr. Yuang");
		Lab l2 = new Lab("LTE Lab", "Dr. Akl");
		s.save(l1);
		s.save(l2);

		// RA students
		RA r1 = new RA();
		r1.setStudent_name("Amar Maharjan");
		r1.setStudent_address("Denton, Texas");
		r1.setStudent_age(32);
		r1.setLab_id(l1);
		r1.setResearch_area("Image Processing");
		r1.setLab_name(l1.getLab_name());
		r1.setSupervisor(l1.getSupervisor());

		RA r2 = new RA();
		r2.setStudent_name("Robin Chataut");
		r2.setStudent_address("Denton, Texas");
		r2.setStudent_age(26);
		r2.setLab_id(l2);
		r2.setResearch_area("Massive MIMO");
		r2.setLab_name(l2.getLab_name());
		r2.setSupervisor(l2.getSupervisor());

		s.save(r1);
		s.save(r2);

		tx.commit();
		s.close();
	}

}
