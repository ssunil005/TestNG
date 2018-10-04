package com.DefaultPriority;
import org.testng.annotations.Test;

public class GamesOfPriority1 {
	
	int i = 100;
	@Test(priority = 4)
	public void testB1()
	{
		System.out.println("testB1 method :" + getClass().getSimpleName()+ i++);
	}  
	
	@Test(priority = 5)
	public void testB2()
	{
		System.out.println("testB2 method : " + getClass().getSimpleName() + i++ );
	}
	
	@Test(priority = 6)
	public void testB3()
	{
		System.out.println("testB3 method : " + getClass().getSimpleName()+ i++);
	}
	
	
	
	

}
