package com.hcl.helloservice;

import java.rmi.RemoteException;

public class MainMethod {

	public static void main(String[] args) {
		HelloProxy h=new HelloProxy();
		try {
			System.out.println("client "+h.sayHello("vinod"));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
