package com.hcl.fiEmploy;

public class Employee {
	private int empno;
	private String empname;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empno) {
		super();
		this.empno = empno;
	}
	public Employee(String empname) {
		super();
		this.empname = empname;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	

}
