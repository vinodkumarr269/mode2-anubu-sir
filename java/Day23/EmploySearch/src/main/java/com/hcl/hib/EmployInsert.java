package com.hcl.hib;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployInsert {
	public static void main(String[] args) {
		Employ e=new Employ();
		e.setEmpno(112);
		e.setName("vinod");
		e.setDesig("soft");
		e.setBasic(12);
		e.setDept("ece");
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
//		Session s=sf.beginTransaction();
//		
		
	}

}
