package com.hcl.demo;

import java.rmi.RemoteException;

public class MainMethod {
	public static void main(String[] args) {
		HelloWorldProxy h=new HelloWorldProxy();
		try {
			System.out.println(h.sayHelloWorld(""));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}

}
