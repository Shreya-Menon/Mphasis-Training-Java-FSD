package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Movie mobj=new Movie();
		mobj.setM_name("Indian movie");
		mobj.setM_name("India");
		Movie_2D mt=new Movie_2D();
		mt.setM_name("ABC");
		mt.setCasting("MLA");
		Movie_3D md=new Movie_3D();
		md.setM_name("def");
		md.setDirector("rohit");
		session.persist(mobj);
		session.persist(mt);
		session.persist(md);
		t.commit();
		System.out.println("done.");
		session.close();
		
	}

}
