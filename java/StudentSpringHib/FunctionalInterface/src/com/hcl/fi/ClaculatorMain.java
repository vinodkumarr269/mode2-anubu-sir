package com.hcl.fi;

public class ClaculatorMain {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		Integer ans=cal.calc((x,y)->x*y,10,5);
		System.out.println(ans);
		
		
	}

}


