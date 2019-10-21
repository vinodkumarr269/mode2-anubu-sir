package com.hcl.fi;

public class EmployMain {
public static void main(String[] args) {
	EmpolyeeInterface e=Employee::new;
	Employee employee=e.employMethod(29, "hcl");
	System.out.println(employee.getEmpNo());
	System.out.println((employee.getEmpName()));
}
}
