package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction t=session.beginTransaction();
		Employee emp=new Employee();
		emp.setEmp_name("Rohit");
		emp.setEmp_company("BCC");
		emp.setEmp_city("Mumbai");
		session.persist(emp);//persistence
		
		Employee obj=session.find(Employee.class, 2);
		System.out.println(obj.getId()+" "+obj.getEmp_name()+" "+obj.getEmp_company()+" "+obj.getEmp_city());
		obj.setEmp_name("fas");
		obj.setEmp_company("oia");
		obj.setEmp_city("goa");
		session.persist(obj);
		t.commit(); 
		System.out.println("Done");
		session.close();//detached
		
	}

}
