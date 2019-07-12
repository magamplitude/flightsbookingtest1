package com.expedia.flightsbookingtest1;

import org.testng.annotations.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestNG_Grouping  {

	@BeforeClass(alwaysRun=true)
	public void setUp() {
		System.out.println("Before Class");
	}

	@Test(groups = {"cars", "suv"})
	public void testBMW() {
		System.out.println("Running Test -> BMW X6");
	}

	@Test(groups = {"cars", "sedan"})
	public void testAudi() {
		System.out.println("Running Test -> Audi A6");
	}
	
	@Test(groups = {"motorcycle"})
	public void testKawasaki() {
		System.out.println("Running Test -> Kawasaki Ninja");
	}

	@Test(groups = {"motorcycle"})
	public void testHonda() {
		System.out.println("Running Test -> Honda CBR");
	}
	
	@AfterClass(alwaysRun=true)
	public void cleanUp() {
		System.out.println("After Class");
	}

}
