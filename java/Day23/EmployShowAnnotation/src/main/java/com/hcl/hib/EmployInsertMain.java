package com.hcl.hib;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployInsertMain {
	public static void main(String[] args) {
		
	Employ e=new Employ();
	Scanner sc=new Scanner(System.in);
	Configuration cfg=new AnnotationConfiguration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	int empno=0;
	System.out.println("enter details");
	Query q=s.createQuery("SELECT max(empno) from Employ");
	for(Iterator it=q.iterate(); it.hasNext();){
		empno=(Integer)it.next();
		
		
	}
	empno++;
	e.setEmpno(empno);
	System.out.println("name");
	e.setName(sc.next());
	System.out.println("dept");
	e.setDept(sc.next());
	System.out.println("desig");
	e.setDesig(sc.next());
	System.out.println("basic");
	e.setBasic(sc.nextInt());
	Transaction t=s.beginTransaction();
	s.save(e);
	t.commit();
	System.out.println("inserted");
	
}
}
