import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hcl.hib.Employ;

public class Main {
public static void main(String[] args) {
int empno=1;
 Configuration cfg = new AnnotationConfiguration();
 cfg.configure("hibernate.cfg.xml");
 SessionFactory sf = cfg.buildSessionFactory();
 Session s=sf.openSession();
 Query q=s.createQuery("from Employ");
 List<Employ> lstEmploy=q.list();
 for(Object ob:lstEmploy) {
   Employ e =(Employ)ob;
   System.out.println("No "+e.getEmpno());
 System.out.println("Name "+e.getName());
 System.out.println("Dept "+e.getDept());
 System.out.println("Designation "+e.getDesig());
 System.out.println("Salary "+e.getBasic());
 System.out.println();
 }
 }
 
}