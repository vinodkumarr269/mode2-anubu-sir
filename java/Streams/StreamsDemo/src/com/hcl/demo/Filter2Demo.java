package com.hcl.demo;

import java.util.ArrayList;
import java.util.List;

public class Filter2Demo {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(10,"apple",1010f,'E'));
		list.add(new Employee(20,"banana",2010f,'M'));
		list.add(new Employee(30,"carrot",3010f,'M'));
		list.add(new Employee(40,"graphes",4010f,'C'));
		list.add(new Employee(50,"dates",5010f,'E'));
		Long noOfRecords=list.stream().count();
		System.out.println(noOfRecords);
		
		Long empsalgt3000=list.stream().filter((var) -> var.getSalary()>3000 && var.getBand() == 'M').count();
		System.out.println(empsalgt3000);
		
		Long sal=list.stream().filter((var) -> (var.getSalary()>1400 && var.getSalary()<4000) && var.getBand() == 'M').count();
		System.out.println(empsalgt3000);
		
	
	}
}