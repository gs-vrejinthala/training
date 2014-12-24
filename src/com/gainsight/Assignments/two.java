package com.gainsight.Assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class two 
{
	public static void main(String[] args) throws IOException
	{
		 int n,i,scr=0;
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter no of qstns:");
		 n=Integer.parseInt(br.readLine());
		 char[] examkey=new char[n+1],ansrs=new char[n+1];
		 System.out.println("Enter exam key & answr key:");
		 for(i=1;i<=n;i++)
		 {
			 examkey[i]=(char)br.read();
			 
		 }
		 ///System.out.println("Enter answers:");
		 for(i=1;i<=n;i++)
		 {
			 ansrs[i]=(char)br.read();
			 
		 }
		 for(i=1;i<=n;i++)
		 {
			 if(ansrs[i]=='?');
			 else
			 {
				 if(examkey[i]==ansrs[i])
				 {
			        scr+=4;
				 }
				 else
				 {
					 scr-=1;
				 }
		   }
		 
	  }
	System.out.println(scr);	 

	}
}	
