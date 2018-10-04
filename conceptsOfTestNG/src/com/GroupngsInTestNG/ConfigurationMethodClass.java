package com.GroupngsInTestNG;
import org.testng.annotations.*;

public class ConfigurationMethodClass 
{
	//Before Suite configurations for test methods belong to group G1
	@BeforeSuite(groups= {"G1"})
	public void BeforeSetUpOfG1Group()
	{
		System.out.println("BeforeSetUpOfG1Group");
	}
	
	//Before Suite configurations for test methods belong to group G1
	@BeforeSuite(groups = {"G2"})
	public void BeforeSetUpOfG2Group()
	{
		System.out.println("Before SetUp Of G2 Group");
	}
	
	//Before Method configuration for test method belong to group G1
	@BeforeMethod(groups= {"G1"})
	public void BeforeMethodOfG1Group()
	{
		System.out.println("Before Method Of G1 Group");
	}
	
	//Before Method configuration for test method belong to group G2 
	@BeforeMethod(groups = {"G2"})
	public void BeforeMethodOfG2Group() 
	{
		System.out.println("BeforeMethodofGroup G2");
		
	}
	
	//After Method configuration for test method belong to group G1
	@AfterMethod(groups = {"G1"})
	public void AfterMethodOfGroupdG1()
	{
		System.out.println("After Method of group G1");
	}
	
	//After Method configuration for test method belong to group G2
	@AfterMethod(groups = {"G2"})
	public void AfterMethodofGroup()
	{
		System.out.println("After Method of group G2");
	}
	
	

}
