package com.hcl.fi;

public class InstanceMethodMain {
	public static void main(String[] args) {
		InterfaceInstance i=()->{System.out.println("hi");};
		i.myInterface();
		
		InstanceMethodReference ref= new InstanceMethodReference();
		InterfaceInstance interfaceInterface2=ref::saySomething;
		interfaceInterface2.myInterface();
			
	}

}
