

package com.cg.desicionmaking;
import java.util.Scanner;

public class Example1 {
	
			public static void main(String[] args) {
				Scanner s =new Scanner(System.in);
				System.out.println("Enter a no.");
				int a=s.nextInt();
				
				for(int i=1;i<=a;i++)
				{
					if(i==51)
					{
						break;
					}
					
					System.out.println(i);
					s.close();
				}
			}
	}