
package com.cg.Operator;

import java.util.Scanner;

public class Increment {

		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			System.out.println("Enter a value a & b");
			int a=s.nextInt();
			int b=s.nextInt();
			
			System.out.println(a++);
			System.out.println(a);
			System.out.println(--b);
			System.out.println(b);
			s.close();
			
		}
}