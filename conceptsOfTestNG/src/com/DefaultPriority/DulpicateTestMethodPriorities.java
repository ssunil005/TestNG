package com.DefaultPriority;

import org.testng.annotations.Test;

public class DulpicateTestMethodPriorities {
	
	@Test(priority = 1)
	public void mA()
	{
		System.out.println("m1 method with priority 1");
	}
	
	@Test(priority = 1)
	public void m$()
	{
		System.out.println("m2 method has method 1");
	}
	
	@Test(priority = 1)
	public void m_()
	{
		System.out.println("method h3 has priority 1");
	}
	
	@Test(priority = 2)
	public void m4()
	{
		System.out.println("method m4 has priority 2");
	}

}
