package com.gainsight.Assignments;

public class Parent
{
	public Parent() {
	      System.out.println("Parent Constructor");
	   }

	   public Parent(int a,int b) {
	      int c=a+b;
	      System.out.println("Sum="+c);
	   }

	   public static void display() {
	      System.out.println("Return Statement");
	   }
}
