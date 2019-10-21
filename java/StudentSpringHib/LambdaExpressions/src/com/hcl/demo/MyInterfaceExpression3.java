package com.hcl.demo;

public class MyInterfaceExpression3 {
	public static void main(String[] args) {
		Myinterface3 m=(var1,var2)->(var1+var2);
		int r=m.addTwoNumbers(10,20);
		System.out.println(r);
	 Myinterface3 m2=(var1,var2)->{ return(var1+var2);};
	 int r2=m2.addTwoNumbers(10,20);
	 System.out.println(r2);
	 }
			
	}


