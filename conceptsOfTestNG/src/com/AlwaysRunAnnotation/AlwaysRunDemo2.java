package com.AlwaysRunAnnotation;
import org.testng.Assert;
import org.testng.annotations.*;

public class AlwaysRunDemo2
{
	@BeforeSuite
	public void beforeSuiteMethod()
	{
		System.out.println("before suite method");
		
		//we fail this explicitly
		Assert.fail();
	}
	
	
	@BeforeTest
	public void beforeTestMethod()
	{
		System.out.println("Before test method");
	}
	
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("before class method");
	}
	
	@BeforeMethod
	public void beforeMethodMethod()
	{
		System.out.println("Before Test Method");
	}
	
	@Test
	public void testMethod()
	{
		System.out.println("Test Method");
	}
	@AfterSuite(alwaysRun = true)
	public void afterSuiteMethod()
	{
		System.out.println("After Suite Method");
	}
	
	@AfterTest
	public void afterTestMethod()
	{
		System.out.println("After Test Method");
	}
	
	@AfterClass
	public void afterClassMethod()
	{
		System.out.println("after class Method");
	}
	
	@AfterMethod
	public void afterMethodMethod()
	{
		System.out.println("After Method Method");
	}
	
	
	
	
	
	

}
