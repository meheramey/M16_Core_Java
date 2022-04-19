
package com.cg.OOPS;

public class Student {int id; String name;
	//Parameterized Constructor
	Student(int i, String n  )
{
	id = i;
	name = n;
}
	void display() 
	{
	System.out.println(id + " " + name);
	}

public static void main(String[] args) {
	Student s1=new Student(11,"Rohit.");
	Student s2=new Student(12,"Sahil.");
	Student s3=new Student(13,"Hrishikesh.");
	s1.display();
	s2.display();
	s3.display();
}

}