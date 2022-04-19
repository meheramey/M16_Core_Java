
package com.cg.Abstract;
class Parent3
{
	void accept()
	{
		System.out.print("Parent-3");
	}
}
class Child3 extends Parent3
{
	void accept()
	{
		System.out.println("Child-3");
	}
	void display()
	{
		accept();
		super.accept();
	}
}
public class Example6 {

	public static void main(String[] args) {
		Child3 c=new Child3();
		c.display();

	}

}