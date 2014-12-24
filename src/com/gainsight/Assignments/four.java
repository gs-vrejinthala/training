package com.gainsight.Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class four
{
	public static void main(String[] args) throws IOException
	{
		int i,j,cnt=0,p=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		int n=Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		{
		   for(j=1,cnt=0;j<=i;j++)
		      if(i%j==0)
			     cnt++;
			if(cnt==2&&n%i==0)
			{
				//System.out.println(i);
				do
				{
					p++;
					n=n/i;
				}while(n%i==0);
				if(n==1)
				  System.out.print(i+"^"+p);
				else
					System.out.print(i+"^"+p+"*");
				p=0;
			}
		}
	}
}
