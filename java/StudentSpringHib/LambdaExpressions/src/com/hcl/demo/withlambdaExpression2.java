package com.hcl.demo;

public class withlambdaExpression2 {
	public static void main(String[] args) {
		MyInterface2 m=()->{System.out.println("welcome vinod");};
		m.sayMessage();
	}

}
