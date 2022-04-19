
package com.cg.Inheritance;

class Parent
{
	int balance = 1000;
	void wealth()
	{
		
		System.out.println("Father: I have only "+balance+"/- Rupees ");
		System.out.println("I will give both of you 50% Each ");
	}
}
class Son1 extends Parent
{	
	int sonMoney = balance/2;
	void sonPocketMoney()
	{
		
		System.out.println("Son Amount= "+sonMoney);
	}
}	

class Sister extends Son1
{	
	
	void sisterPocketMoney()
	{
		System.out.println("Sister Amount= "+sonMoney);
	}
}


public class MultilevelInheritance {

		public static void main(String[] args) {
			Sister s =new Sister();
			System.out.println("Son And Sister : I want Totel money");
			s.wealth();
			s.sonPocketMoney();
			s.sisterPocketMoney();
			
			
		}
}