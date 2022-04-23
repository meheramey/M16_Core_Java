package com.cg.Fibo;
import java.util.Scanner;

public class Fibo {
	static int n1=0,n2=1,n3=0;   
	 public static void series(int count)
	{
		 
		
		  if(count>0)  
		 {  
		  n3=n1+n2;    
		  n1=n2;    
		  n2=n3;
		  System.out.print(" "+n3); 
		 series(count-1);
		 }  
	}
	
	public static void main(String[] args)   
	{  
		System.out.print("Enter a nth term : ");
		Scanner s =new Scanner(System.in);
		int count =s.nextInt();
	 System.out.print(n1+" "+n2);    
	 series(count-2);
	  
	} 
}