package com.hcl.webService;

import java.rmi.RemoteException;

public class MainApplication {

	public static void main(String[] args) {
		int result=0;
		int result1=0;
		CalculatorProxy c=new CalculatorProxy();
		try {
			result=c.mul(2,4);
			result1=c.add(2, 3);
			System.out.println("multiplication "+result);
			System.out.println("addition "+result1);
			System.out.println(c.display());
			System.out.println(c.getRaghu());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

}
