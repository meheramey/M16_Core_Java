

package com.cg.Operator;
import java.util.Scanner;
public class Relational {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value a & b");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b)
		{
			System.out.println("a is greater then b");
		}
		if(a<b)
		{
			System.out.println("b is greater than a");
		}
		if(a>=b)
		{
			System.out.println("a is greater than or equal to b ");
		}
		if(a<=b) 
		{
			System.out.println("b is greater than or equal to b");
		}
		if(a!=b)
		{
			System.out.println("a is not equal to b");
		}
		if(a==b)
		{
			System.out.println("a is equal to b ");
		}
		s.close();
	}
}