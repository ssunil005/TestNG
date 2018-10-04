package com.GroupsOfGroups;
import org.testng.annotations.*;

public class GroupsOfGroups {
	/* submodules mod1,mod2,mod3 belong from super-mod1 
	 * & mod4,mod5,mod6 belongs from super-mod2
	 */
	@Test(groups = {"mod 1"})
	public void mod1()
	{
		System.out.println("mod 1");
	}
	
	@Test(groups = {"mod 2"})
	public void mod2()
	{
		System.out.println("mod 2");
	}
	
	@Test(groups = {"mod 3"})
	public void mod3()
	{
		System.out.println("mod 3");
	}
	
	@Test(groups = {"mod 4"})
	public void mod4()
	{
		System.out.println("mod 4");
	}
	
	@Test(groups = {"mod 5"})
	public void mod5()
	{
		System.out.println("mod 5");
	}
	
	@Test(groups = {"mod 6"})
	public void mod6()
	{
		System.out.println("mod 6");
	}
	
	

}
