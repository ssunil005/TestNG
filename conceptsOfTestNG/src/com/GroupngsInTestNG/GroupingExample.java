package com.GroupngsInTestNG;
import org.testng.annotations.*;

public class GroupingExample {
	
	//A method belongs to Group g1
	@Test(groups = {"G1"})
	public void G1Method1()
	{
		System.out.println("G1 method");
	}
	
	@Test(groups = {"G1"})
	public void G1Method2()
	{
		System.out.println("G1 method");
	}
	
	@Test(groups = {"G1"})
	public void G1Method3()
	{
		System.out.println("G1 method");
	}
	
	//A test method belongs to group G2
	
	@Test(groups = {"G2"})
	public void G2Method1()
	{
		System.out.println("G2 method");
	}
	
	@Test(groups= {"G2"})
	public void G2Method2()
	{
		System.out.println("G2method");
	}
	
	@Test(groups= {"G3"})
	public void G3Method1()
	{
		System.out.println("G3Method");
		
	}
	
	@Test(groups = {"G3"})
	public void G3Method2()
	{
		System.out.println("G3Method4");
	}
	
	@Test(groups = {"G4"})
	public void G4Method1()
	{
		System.out.println("group G4");
	}
}
