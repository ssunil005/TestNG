package com.GroupngsInTestNG;
import org.testng.annotations.*;


public class GroupingConfigurationMethods 
{
	//Before suite configuration for test methods belong to group G1
	@BeforeSuite(groups = {"G1"})
	public void BeforeSetUpOfG1Group() 
	{
		System.out.println("Before steup of G1 Group");
	}
	
	//Before suite configuration for test methods belong to group G2
	@BeforeSuite(groups = {"G2"})
	public void BeforeSetupG2Group()
	{
		System.out.println("Before setup of G2 group");
	}
	
	//Before method configuration for test methods belong to group G1
	@BeforeMethod(groups = {"G1"})
	public void BeforeMethodOfGroupG1()
	{
		System.out.println("Before method G1 group");
	}
	
	//Before method configuration for the test methods belong to group g2
	@BeforeMethod(groups = {"G2"})
	public void BeforeMethodofG1Group()
	{
		System.out.println("before method of g1 group");
	}
	
	
	
	
	
	
	
	
	

}
