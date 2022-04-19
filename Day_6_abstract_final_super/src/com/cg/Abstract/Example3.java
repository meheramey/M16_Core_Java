
package com.cg.Abstract;

class Parent
{
	final void accept() //this is final method as we use final keyword
	{
		System.out.print("Parent");
	}
}
	class Child extends Parent
{
	void print() //we can not override method in this class 
	{
		System.out.println("Child");
	}
}	
public class Example3 {

	public static void main(String[] args) {
		Child c=new Child();
		c.print();

	}

}