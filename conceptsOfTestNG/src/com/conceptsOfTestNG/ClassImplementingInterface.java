package com.conceptsOfTestNG;

import org.testng.annotations.Test;

public class ClassImplementingInterface  implements TestInterface{
	
	@Test
	public void diverClassMethod() 
	{
		System.out.println("Driver class method");
	}

}
