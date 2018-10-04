package com.TestNgpackage1;
import org.testng.annotations.*;

public class GroupingExampleFromP1 {
	//A test method belong to Group G1FromP1
	
	@Test(groups = {"G1FromP1"})
	public void G1FromP1()
	{
		System.out.println("G1FromP1");
	}
	
	//A test method belong to group G2Fromp1
	@Test(groups = {"G2FromP1"})
	public void G2FromP1()
	{
		System.out.println("G2FromP1");
	}
	
	@Test(groups = {"G3FromP1"})
	public void G3FromP1()
	{
		System.out.println("G3FromP1");
	}
	
	

}
