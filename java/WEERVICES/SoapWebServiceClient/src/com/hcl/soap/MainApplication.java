package com.hcl.soap;

import java.rmi.RemoteException;

public class MainApplication {

	public static void main(String[] args) {
		int result=0;
		int result1=0;
		 SoapProxy c =new SoapProxy();
		try {
			System.out.println(c.getName());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

}
