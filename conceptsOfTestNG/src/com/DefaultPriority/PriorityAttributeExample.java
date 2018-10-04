package com.DefaultPriority;

import org.testng.annotations.Test;

public class PriorityAttributeExample {
	
	// we can pass priority as negative value.
	@Test(priority = -1)
	public void negativePriority()
	{
		System.out.println("Method having negative priority");
	}
	
	// we can pass priority as default value zero.
	@Test(priority = 0)
	public void zerothPriority()
	{
		System.out.println("method with zeroth priority");
	}
	
	@Test(priority = 1)
	public void positivePriority()
	{
		System.out.println("method with positive priority");
	}
	
	@Test(priority = 100)
	public void skippedPriority()
	{
		System.out.println("skipped priority");
	}

}
