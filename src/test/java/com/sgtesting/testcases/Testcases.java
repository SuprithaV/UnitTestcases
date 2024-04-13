package com.sgtesting.testcases;

import org.testng.annotations.Test;

public class Testcases {
	
	@Test(priority=1)
	static void method1()
	{
		System.out.println("method1");
	}
	
	@Test(priority=2)
	static void method2()
	{
		System.out.println("method2");
	}
	
	@Test(priority=3)
	static void method3()
	{
		System.out.println("method3");
	}
	
	@Test(priority=4)
	static void method4()
	{
		System.out.println("method4");
	}
}
