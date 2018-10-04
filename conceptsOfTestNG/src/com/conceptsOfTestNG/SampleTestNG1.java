package com.conceptsOfTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNG1
{
	@Test
	public void verifyString() 
	{
		String s1 = "Selenium";
		String s2 = "Selenium WebDriver";
		
		 Assert.assertEquals(s1,s2);
		
		
	}
	@Test
	public void verifyVariableValue()
	{
		int x = 10;
		Assert.assertTrue(x>10, "message");
		
	}

}
