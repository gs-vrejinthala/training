package com.gainsight.Assignments;
import java.util.*;
import java.lang.*;
import java.io.*;
public class one
{
	public static void main(String[] args) throws IOException
	{
		String frst,scnd;
		int i,j,cnt=0,l1,l2;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter first string");
		frst = br.readLine();
		System.out.println("enter second string");
		scnd = br.readLine();
		l1=frst.length();
		l2=scnd.length();
		for(i=1;i<l1;i++)
			for(j=1;j<l2;j++)
				if(frst.substring(i-1,i+1).equals(scnd.substring(j-1,j+1)))
					cnt++;
		System.out.println(cnt);		
		
	}
}