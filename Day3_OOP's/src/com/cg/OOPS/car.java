
package com.cg.OOPS;
public class car {
	String name = "BMW";//variable
	void print()//method
	{
		System.out.println("This is "+name);
	}

	public static void main(String[] args)
	{
		car obj = new car();
		obj.print();
		
	}

}