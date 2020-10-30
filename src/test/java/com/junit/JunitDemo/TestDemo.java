package com.junit.JunitDemo;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDemo {
	int num;
	
	@Before 
	public void beforetest(){
		System.out.println("Before Executed");
	}
	@Test
	public void testeven(){
		
		assertTrue(EvenOdd.even(num));
		System.out.println("Number is even");
		
	}
	@After
	public void aftertest(){
		System.out.println("After Executed");
		
	}
	}

