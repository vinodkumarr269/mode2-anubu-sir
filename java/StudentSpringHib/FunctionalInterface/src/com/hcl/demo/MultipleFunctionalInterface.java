package com.hcl.demo;

public class MultipleFunctionalInterface {

	public static void main(String[] args) {
		
		MyInterface m=(var1)-> {return var1;};
		String r=m.sayHello("vinod");
		System.out.println(r);
int x=MyInterface.add(2,3);
		System.out.println(x);
System.out.println(MyInterface.defaultMethod(10));
		
		MyInterface m2=(var1)->(var1);
		System.out.println(m.equals(m2));
		
		
		
	}

}
