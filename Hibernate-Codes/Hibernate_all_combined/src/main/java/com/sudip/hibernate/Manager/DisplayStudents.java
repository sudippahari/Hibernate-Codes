package com.sudip.hibernate.Manager;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sudip.hibernate.student.RA;
import com.sudip.hibernate.student.Student;
import com.sudip.hibernate.subject.Subject;

public class DisplayStudents {

	public static void main(String[] args) {

		GetSession gs = new GetSession();
		Session s = gs.getSession();
		Transaction tx = s.beginTransaction();

		// HQL statements for bulk select
		Query student_query = s.createQuery("from Student");
		List<Student> std_list = student_query.list();
		Query ra_query = s.createQuery("from RA");
		List<RA> ra_list = ra_query.list();
		Query ta_query = s.createQuery("from Subject");
		List<Subject> ta_list = ta_query.list();

		System.out.println("=======================================================");
		System.out.println("All Student names: ");
		System.out.println("-------------------------------------------------------");

		int i = 1;
		for (Student x : std_list) {
			System.out.println(i + "\t" + x.getStudent_id() + "\t" + x.getStudent_name() + "\t\t"
					+ x.getStudent_address() + "\t" + x.getStudent_age());
			i++;
		}

		System.out.println("=======================================================");
		System.out.println("RAs and labs information: ");
		System.out.println("-------------------------------------------------------");

		i = 1;
		for (RA x : ra_list) {
			System.out.println(i + "\t" + x.getStudent_id() + "\t" + x.getStudent_name() + "\t\t"
					+ x.getStudent_address() + "\t" + x.getStudent_age() + "\t" + x.getResearch_area() + "\t"
					+ x.getLab_name() + "\t" + x.getSupervisor() + "\t" + x.getLab_id());
			i++;
		}

		System.out.println("=======================================================");
		System.out.println("TAs and subject information: ");
		System.out.println("-------------------------------------------------------");

		i = 1;
		for (Subject x : ta_list) {
			System.out.println(i + "\t" + x.getTa().getStudent_name() + "\t" + x.getTa().getStudent_id() + "\t"
					+ x.getTa().getStudent_age() + "\t" + x.getTa().getStudent_address() + "\t"
					+ x.getTa().getAvailable_day() + "\t\t" + x.getProfessor() + "\t" + x.getSubject_id() + "\t"
					+ x.getSubject_name());
			i++;
		}
		
	}

}
