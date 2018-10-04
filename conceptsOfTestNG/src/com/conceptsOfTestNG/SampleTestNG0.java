package com.conceptsOfTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNG0
{
	@Test
	public void verifyString() 
	{
		String s1 = "Selenium";
		String s2 = "Selenium";
		
		 Assert.assertEquals(s1,s2);
		
		
	}
	class InnerClass
	{
	@Test
	public void verifyVariableValue()
	{
		System.out.println("inner");
		
	}
	}
}
