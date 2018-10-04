package com.GroupngsInTestNG;
import org.testng.annotations.*;

public class GroupingConceptWithConfigurationMethods {
	
	@BeforeSuite
	public void BeforeSetUpOfTS1()
	{
		System.out.println("BeforSetUpOfTS1");
	}
	
	@BeforeMethod
	public void BeforeMethodTes1()
	{
		System.out.println("BeforeMethodOfTes1");
	}
	
	@AfterMethod
	public void AfterMethodOfTes1()
	{
		System.out.println("After Method of Test1");
	}
	
	@AfterSuite
	public void AfterSuiteOfTs1()
	{
		System.out.println("After Suite of Ts1");
	}

}
