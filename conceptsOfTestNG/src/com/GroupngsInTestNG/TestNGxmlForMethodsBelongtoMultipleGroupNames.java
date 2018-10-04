package com.GroupngsInTestNG;
import org.testng.annotations.*;

public class TestNGxmlForMethodsBelongtoMultipleGroupNames 
{
	//A test method belong to Group G1 & G2
	@Test(groups = {"G1","G2"})
	public void MethodBelongToG1G2()
	{
		System.out.println("MethodBelongToGroupG1G2");
	}
	
	// A test method belong to Group G1,G2,G3
	@Test(groups = {"G1","G2","G3"})
	public void MethodBelongToG1G2G3()
	{
		System.out.println("Method belong to Group G1, G2, G3");
	}
	
	//A test method belong to group G1
	@Test(groups = {"G1"})
	public void methodBelongToGroupG1()
	{
		System.out.println("Method belong to Group G1");
	}

	// A test method belong to Group G2
	@Test(groups = {"G2"})
	public void methodBelongToGroupG2()
	{
		System.out.println("method belong to group G2");
	}
	
	// A test method belong to group G3
	@Test(groups = {"G3"})
	public void methodBelongToGroupG3()
	{
		System.out.println("method belong to group G3");	
	}
	
	// A test method belong to group G1 & G3
	@Test(groups = {"g1","G3"})
	public void MethodBelongToGroupG1G3()
	{
		System.out.println("method belongs to group G1 & G3");
	}
	
	
	}
	
	

