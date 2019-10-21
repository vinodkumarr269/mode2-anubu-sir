package com.hcl.fiEmploy;


public class EmployeeMain {
public static void main(String[] args) {
EmployeeInterface emp=Employee::new;
EmployInterface2 emp2=Employee::new;
com.hcl.fiEmploy.Employee e=emp.empNo(1);
com.hcl.fiEmploy.Employee e2=emp2.empName("vinod");
System.out.println(e.getEmpno());
System.out.println(e2.getEmpname());


}
}
