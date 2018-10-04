package com.TestNgpackage2;

import org.testng.annotations.Test;

public class GroupingExampleFromP2 {

	//A test method belong to Group G1FromP1
	
	@Test(groups = {"G1FromP2"})
	public void G1FromP2()
	{
		System.out.println("G1FromP2");
	}
	
	//A test method belong to group G2FromP2
	@Test(groups = {"G2FromP2"})
	public void G2FromP2()
	{
		System.out.println("");
	}
	
	// A test method belong to group G3FromP2
	@Test(groups = {"G3FromP2"})
	public void G3FromP2()
	{
		System.out.println("G3FromP2");
	}

}
