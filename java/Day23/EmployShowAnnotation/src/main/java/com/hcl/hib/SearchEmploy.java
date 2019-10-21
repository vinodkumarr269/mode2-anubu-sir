package com.hcl.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class SearchEmploy {
	public static void main(String[] args) {
		int empno;
		System.out.println("enter emp no ");
		Scanner sc= new Scanner(System.in);
		empno=sc.nextInt();
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ WHERE Empno="+empno);
		List list=q.list();
		
		if(list.size()!=0){
			Employ e=(Employ)list.get(0);
			System.out.println("Name"+e.getName());
			System.out.println("Dept"+e.getDept());
			System.out.println("desig"+e.getDesig());
			System.out.println("basic"+e.getBasic());
		}
		else{
			System.out.println("record not inserted");
		}
	}

}
