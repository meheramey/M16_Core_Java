package com.cg.Fibo;

import java.util.Scanner;

public class Maths {
	static long b,c,sum; 
	 public static long sumOfDigits(long a)   
	{
		 if(a==0)
		 { 
			 return 0;
		 }
		 else
		 {
		 c=a%10;
		 b=a/10;
		 sum=c+(sumOfDigits(b));
		 return (sum);
		 }	 
		 
	}
	
	public static void main(String[] args)   
	{  
		System.out.print("Enter a digit : ");
		Scanner s =new Scanner(System.in);
		long a =s.nextLong();
		System.out.print("Sum of Digits : "+(sumOfDigits(a)));
	} 
}
