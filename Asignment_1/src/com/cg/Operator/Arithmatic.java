

package com.cg.Operator;

import java.util.Scanner;

public class  Arithmatic{
		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			System.out.println("Enter a value a & b");
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println("Add= "+(a+b));
			System.out.println("Sub= "+(a-b)); 
			System.out.println("Multi= "+(a*b));
			System.out.println("Div= "+((double)a/b));
			System.out.println("mod= "+((double)a%b));
			s.close();
		}
}