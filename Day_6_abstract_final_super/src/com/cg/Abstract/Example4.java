
package com.cg.Abstract;

class Bike
{
	final void accept()
	{
		System.out.println("Bike");
	}
}
class main extends Bike
{
	void run()
	{
		System.out.println("running safely with 1000kmph");
	}
}	
public class Example4 {

	public static void main(String[] args) {
		main Honda=new main();
		Honda.run();

	}

}