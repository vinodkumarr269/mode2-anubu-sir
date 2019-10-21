package com.hcl.fi;

import java.util.function.Consumer;

public class MyInterface2Main {
	public static void main(String[] args) {
		MyInterface2 myInterface=(a)->{System.out.println(a);};
		myInterface.someMethod("HCL");
		
		MyInterface2 myInterface1=System.out::println;
		myInterface1.someMethod("java CoE");
		myInterface1.someMethod("Hello Guys");
		
		Consumer<String> consumer=System.out::println;
		consumer.accept("BYe");
	}

}
