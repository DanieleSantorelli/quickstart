package com.prova.maven.quickstart;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest {

	@Test
	public void testSum() {
		int a = 13;
		int b = 15;
		Operation operazione = new Operation(a,b);
		int c= operazione.sum();
		
		assertEquals(c, 28);
	}
	
	@Test
	public void testMinus() {
		int a = 15;
		int b = 13;
		Operation operazione = new Operation(a,b);
		int c= operazione.minus();
		
		assertEquals(c, 2);
	}

}
