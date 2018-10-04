package com.DefaultPriority;
import org.testng.annotations.*;

public class GamesOfPriority0 {
	
	static int val = 10;
	@Test(priority = 1)
	public void testA1()
	{
		System.out.println("testA1 from " + getClass().getSimpleName() + "class and value is : " +val++);
	}
	
	@Test(priority = 2)
	public void testA2()
	{
		System.out.println("testA2 from " + getClass().getSimpleName() + " class and value is : " +val++);
	}
	
	@Test(priority = 3)
	public void testA3()
	{
		System.out.println("testA3 from " + getClass().getSimpleName()+"class and value is :" +val++);
	}
	

}
