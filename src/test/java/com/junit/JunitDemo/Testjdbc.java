package com.junit.JunitDemo;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testjdbc {

	@Before
	public void beforemethod(){
		System.out.println("Before method executed");
	}
		@Test
		public void connect(){
			assertTrue(JdbcConnect.connect());
			System.out.println("Test succesful");
		}
		@After
		public void aftermethod(){
			System.out.println("After method executed");
		}
	}

