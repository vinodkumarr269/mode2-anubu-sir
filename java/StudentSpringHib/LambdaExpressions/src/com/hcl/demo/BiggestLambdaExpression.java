package com.hcl.demo;

public class BiggestLambdaExpression {
public static void main(String[] args) {
	Biggest b= (int var1,int var2)-> { int max = var1>var2?var1:var2; return max;};
	int r=b.big(20, 10);
	System.out.println(r);
//	Biggest x= (var3,var4)-> { int max = var1>var2?var1:var2; return max;};
//	int c=b.small(20, 10);
//	System.out.println(r);
}
}
