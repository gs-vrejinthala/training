package com.gainsight.Assignments;

public class Child2 extends child{
	public Child2() {
	      System.out.println("Child2 Constructor");
	   }
	public Child2(int a,int b) {
		System.out.println("Parameterized Child2 constructor");
	      int c=a-b;
	      System.out.println("Difference="+c);
	   }

}
