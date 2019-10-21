package com.hcl.employ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		org.hibernate.Query q;
		q=s.getNamedQuery("HQL_GET_EMPLOY_BY_EMPNO");
		q.setInteger("empno",2);
		Employ emp=(Employ) q.uniqueResult();
		System.out.println(emp);
		sf.close();
		
	} 
 
}
 