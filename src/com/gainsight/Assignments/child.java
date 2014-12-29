package com.gainsight.Assignments;

public class child extends Parent
{
	public child() {
	      System.out.println("child Constructor");
	   }
	public child(int a,int b)   
	{
		System.out.println("Parameterized child constructor");
	      int c=a-b;
	      System.out.println("Difference="+c);
	}
	public static void display() {
		
	      System.out.println("static child");
	   }
}
