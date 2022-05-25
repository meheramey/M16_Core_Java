package com.cg.users;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Users {

	public static void main(String[] args) {
		BankFactory s=new MMBankFactory();
		SavingAcc p=new MMSavingAcc(1000254501,"Amey Banarase",77000.47F, true);
		CurrentAcc n=new MMCurrentAcc(1000254502, "Kaustubh Ingle", 21452.5F,50);
		System.out.println("Saving Account");
		p.withdraw(p.getaccBal());
		System.out.println("Current Account");
		n.withdraw(n.getMINBAL());
		
		
		System.out.println(p);
		System.out.println(n);

	}

}