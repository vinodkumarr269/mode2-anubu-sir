package com.hcl.demo;
@FunctionalInterface
public interface MyInterface {
	public String sayHello(String name);
	
	public static int add(int num1,int num2){return num1+num2;}
	
	
	boolean equals(Object obj);
	
	
	public static int defaultMethod(int variable){
		return variable+100;
	}

}
