package com.GroupngsInTestNG;
import org.testng.annotations.*;
//Marking a class with @Test annotation
	//Assign a group at test level itself
	//it will be inherited to methods of class
	
@Test(groups = {"G1"})
public class GroupsAnnotationsAtClassLevel 
{
	
	//@Test will be inherited from class level
	//Group information will also be inherited
	
	public void G1Method1()
	{
		System.out.println("G1Method1");
	}
	
	public void G1Method2()
	{
		System.out.println("G1Method2");
	}
	
	public void G1Method3()
	{
		System.out.println("G1Method3");
	}
	

}
