package com.GroupngsInTestNG;
import org.testng.annotations.*;

public class ATestNGClassContainingMultipleTestMethodsBelongingToMultipleGroups
{
	// A test method belongs to group G1 & G2
	
	@Test(groups = {"G1","G2"})
	public void MethodsBelongToG1G2()
	{
		System.out.println("Method belongs to Group G1 & G2");
	}
	
	// A test method belongs to groups G1, G2 & G3
	
	@Test(groups = {"G1","G2","G3"})
	public void MethodBelongsToG1G2G3()
	{
		System.out.println("Method Belongs to group G1, G2 & G3");
	}
	
	//A Test method belongs to group G1
	@Test(groups = {"G1"})
	public void MethodBelongsToGroupsG1()
	{
		System.out.println("Method Belongs to group G1");
	}
	
	// A test method belongs to Group G2
	public void MethodBelongsTogroupsG2()
	{
		System.out.println("Method belongs to group G2");
	}
	
	// A Test method belongs to group G3
	@Test(groups = {"G3"})
	public void MethodbelongsToGroupsG3()
	{
		System.out.println("Method belongs to Group G3");
	}
	
	//A test method belongs to G1 & G3
	@Test(groups = {"G1","G3"})
	public void MethodBelongsToGroupG1G3()
	{
		System.out.println("Method belongs to G1 & G3");
		
	}
	
	

}
