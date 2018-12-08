package com.sudip.hibernate.Manager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sudip.hibernate.student.TA;

public class UpdateStudent {

	public static void main(String[] args) {

		GetSession gs = new GetSession();
		Session s = gs.getSession();
		Transaction tx = s.beginTransaction();

		TA t = (TA) s.get(TA.class, 1);
		t.setAvailable_day("Friday");
		
		s.delete(t);
		tx.commit();
		s.close();
	}

}
