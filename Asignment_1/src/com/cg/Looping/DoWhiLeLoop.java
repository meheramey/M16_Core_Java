
package com.cg.Looping;
import java.util.Scanner;

	

	public class DoWhiLeLoop {

			public static void main(String[] args) {
				Scanner s =new Scanner(System.in);
				System.out.println("Enter a no.");
				int a=s.nextInt();
				int i=1;
				do{
					System.out.println(i);
					i++;
				}while(i<=a);
			}
	}