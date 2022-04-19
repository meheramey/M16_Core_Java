
package com.cg.Operator;
import java.util.Scanner;
public class Logical {
	
	public static void main(String[] args) {
				Scanner s =new Scanner(System.in);
				System.out.println("Enter a value a & b");
				int a=s.nextInt();
				int b=s.nextInt();
				int c=s.nextInt();
				if(a>b && b==c)
				{
					System.out.print("wel-");
				}
				if(a<b || b==c)
				{
					System.out.print("come ");
				}
				if(!(a==b))
				{
					System.out.print("to home");
				}
				s.close();
			}
	}