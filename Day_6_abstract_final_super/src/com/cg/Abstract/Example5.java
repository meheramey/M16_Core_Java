
package com.cg.Abstract;

class Fruit
{
	String name="Apple";
}
class Juice extends Fruit
{	
	String name="Apple Juice";
	void print()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class Example5 {

	public static void main(String[] args) {
		Juice j=new Juice();
		j.print();
	}

}