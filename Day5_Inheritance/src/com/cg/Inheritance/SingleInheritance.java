package com.cg.Inheritance;

class Father
{
	int balance = 100000;
	void wealth()
	{
		
		System.out.println("Father: But 50% Amount For Your Sister ");
	}
}
class Son extends Father
{
	void pocketMoney()
	{
		System.out.println("Son: I want Totel money");
	}
}
public class SingleInheritance {
	
	public static void main(String[] args) {
		Son c=new Son();
		c.pocketMoney();
		System.out.println("Son Amount= "+(c.balance/2));
		c.wealth();

	}

}