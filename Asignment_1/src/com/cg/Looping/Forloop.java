

package com.cg.Looping;
import java.util.Scanner;

public class Forloop {

		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			System.out.println("Enter a no.");
			int a=s.nextInt();
			
			for(int i=1;i<=a;i++)
			{
				System.out.println(i);
			}
			
			s.close();
		}
}