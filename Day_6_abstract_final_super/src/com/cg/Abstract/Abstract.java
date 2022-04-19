
package com.cg.Abstract;

abstract class X
{
	abstract void print();
	
}
class Y extends X
{
	void print()
	{
		System.out.println("Welcome to JFS program");
	}
}
public class Abstract{

	public static void main(String[] args) {
		Y obj=new Y();
		obj.print();
		
	}

}