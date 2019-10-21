package com.hcl.fi;

public class MethodReferenceStaticMain {
	public static void main(String[] args) {
		MethidReferenceStatic static1=(a)->{return "Welcome"+a;};
		System.out.println(static1.satHello(22));
		MethidReferenceStatic static2=MethidReferenceStatic::someMethod;
		System.out.println(static2.satHello(44));
	}
	

}
