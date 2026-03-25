package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Vehicle vobj=new Vehicle();
		vobj.setV_name("Car");
		vobj.setLicenseNumber(123123);
		TwoWheeler tobj=new TwoWheeler();
		tobj.setV_name("Bike");
		tobj.setSteeringHandle("bike steering handle");
		FourWheeler fobj=new FourWheeler();
		fobj.setV_name("tesla");
		fobj.setSteeringWheel("smart steering wheel");
		session.persist(vobj);
		session.persist(tobj);
		session.persist(fobj);
		t.commit();
		System.out.println("done");

	}

}
