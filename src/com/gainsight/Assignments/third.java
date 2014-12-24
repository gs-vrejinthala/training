package com.gainsight.Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class third
{
	public static void main(String[] args) throws IOException
	{
		//char[] frst,scnd;
		int m,n,i,k,j,cnt=0,x=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of elements in frst & scnd array");
		m=Integer.parseInt(br.readLine());
		//System.out.println("enter no of elements in scnd array");
		n=Integer.parseInt(br.readLine());
		char[] frst=new char[m+1],scnd=new char[n+1],rslt=new char[m+n+1];
		System.out.println("enter first & scnd array elements:");
		for(i=0;i<m;i++)
			frst[i]=(char)br.read();
		for(i=0;i<n;i++)
			scnd[i]=(char)br.read();
		for(i=0;i<m;i++)
		{
			for( j=i+1,cnt=0;j<m;j++)
				if(frst[i]==frst[j])
					cnt++;
			if(cnt==0)
				rslt[x++]=frst[i];
			
		}
		x--;
		for(i=0;i<n;i++)
		{
			for(j=i+1,cnt=0;j<x;j++)
			    if(rslt[j]==scnd[i])
					cnt++;
				if(cnt==0)
					rslt[++x]=scnd[i];
			
		}
		
		System.out.print(rslt);
	}
}
