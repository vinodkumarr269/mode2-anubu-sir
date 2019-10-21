package com.hcl.hib;

import java.util.List;

import org.eclipse.jdt.core.BuildJarIndex;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployCrude {
	public List<Employ> showEmploy(){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ");
		List<Employ> lstEmploy=q.list();
		return lstEmploy;
	}
	
	public Employ searchEmploy(int empno){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ where empno="+empno);
		List<Employ> lstEmploy=q.list();
		Employ e=null;
		if(lstEmploy.size()!=0){
			e=lstEmploy.get(0);
		}
		return e;
	}
	public String insertEmploy(Employ employ) {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(employ);
		t.commit();
		return "Record Inserted...";

		}
	
	public String updateEmploy(Employ employ){
		Employ res=searchEmploy(employ.getEmpno());
		res.setName(employ.getName());
		res.setDept(employ.getDept());
		res.setDesig(employ.getDesig());
		res.setBasic(employ.getBasic());
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.update(res);
		t.commit();

		return "record updated";
	}
	public String deleteEmploy(int empno){
		Employ res=searchEmploy(empno);
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.delete(res);
		t.commit();
		return "account deleted";
		
	}
}
