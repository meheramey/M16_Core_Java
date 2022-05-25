package com.cg.framework;

public abstract class CurrentAcc extends BankAcc {
	private final float MINBAL;
	public CurrentAcc(int accNo, String accNm, float accBal,float MINBAL) 
	{
		super(accNo, accNm, accBal);
		this.MINBAL=MINBAL;
		
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account no is "+this.getAccNo()+" Account name is: "
				+this.getAccNm()+" "+"Balance is : "+(accBal+MINBAL));
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [MINBAL=%s, toString()=%s]", MINBAL, super.toString());
	}
}
