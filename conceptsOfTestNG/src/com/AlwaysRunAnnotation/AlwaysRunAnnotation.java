package com.AlwaysRunAnnotation;
import org.testng.Assert;
import org.testng.annotations.*;

public class AlwaysRunAnnotation {
	
	@Test
	public void method1()
	{
		System.out.println("method 1");
		//failing test explicitly
		Assert.fail();
	}
	
	//This method will run only if method1 is passed.if method1 is failed or skipped,method2 will not run.
	@Test(dependsOnMethods ="method1",alwaysRun = true)
	public void method2()
	{
		System.out.println("method 2");
	}
	
	/*//Since method1 will fail,so method2 will be skipped. since method2 is skipped,
	method3 will also be skipped as method3 is dependent on method2.*/
	
	@Test(dependsOnMethods = "method2",alwaysRun = true)
	public void method3()
	{
	System.out.println("method 3");	
	}
	
	//to make any method always run even if dependent method fails or skipped,set "alwaysRun" attribute to true.
	
	
	

}
