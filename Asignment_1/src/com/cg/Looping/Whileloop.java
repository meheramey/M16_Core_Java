
package com.cg.Looping;
import java.util.Scanner;

public class Whileloop {

		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			System.out.println("Enter a no.");
			int a=s.nextInt();
			int i=1;
			while(i<=a){
				System.out.println(i);
				i++;
			s.close();
			}
		}
   }