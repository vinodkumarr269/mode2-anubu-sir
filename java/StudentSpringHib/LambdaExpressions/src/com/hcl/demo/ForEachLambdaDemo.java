package com.hcl.demo;


import java.util.ArrayList;

public class ForEachLambdaDemo {

	public static void main(String[] args) {
		java.util.List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
	list.forEach((var) ->System.out.println(var));
	}

}
