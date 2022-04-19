package com.cg.Inheritance;

class RBI_Bank
{
	void bank()
	{	
		System.out.println("WEL-COME TO Reserve Bank of India");
		System.out.println("List of Bank Under RBI");
		System.out.println();
	}
}
class BankOfMaharashtra extends RBI_Bank
{
	void bOM()
	{
		System.out.println("Bank Of Maharashtra ");
	}
}
class CentralBankOfIndia extends RBI_Bank
{
	void cBOFI()
	{
		System.out.println("Central Bank Of India");
	}
}
	
public class Hirarachicallnheritance {

	public static void main(String[] args) {
		BankOfMaharashtra b=new BankOfMaharashtra();
		CentralBankOfIndia c=new CentralBankOfIndia();
		b.bank();
		b.bOM();
		c.cBOFI();;
		
	}

}
