

package com.cg.Operator;
import java.util.Scanner;
 public class Ternory {
	
		public static void main(String[] args) {
				Scanner s =new Scanner(System.in);
				System.out.println("Enter a value a & b");
				int a=s.nextInt();
				int b=s.nextInt();
				
				int max = (a>b)? a:b;
				System.out.println(max);
				
				if(a>b)
				{
					System.out.println(a);
				}
				else
				{
					System.out.println(b);
				}
				s.close();
				
			}
 }