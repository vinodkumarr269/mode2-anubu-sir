package com.hcl.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Datex {
	
	public static void main(String[] args) {
		DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,new Locale("in", "IN"));
		System.out.println("long "+df.format(new Date()));
	}

}
