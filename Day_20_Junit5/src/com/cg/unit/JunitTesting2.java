package com.cg.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitTesting2 {
	@Test
	void print() 
	{
		int a=1;
		int b=2;
		assertEquals(a, b);
	}
	@Test
	void print1() 
	{
		int a=2;
		int b=2;
		assertEquals(a, b);
	}


}
