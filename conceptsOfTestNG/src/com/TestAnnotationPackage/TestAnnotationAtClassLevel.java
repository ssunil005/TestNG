package com.TestAnnotationPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Can test annotations be used for a class in testNG

@Test
public class TestAnnotationAtClassLevel 
{
	@BeforeClass
	public void m1()
	{
		System.out.println("Before class annotated method m1");
	}
	
	public void m2()
	{
		System.out.println("method m2");
	}
	
	public void m3()
	{
		System.out.println("method m3");
	}
	
	@AfterClass
	public void m4()
	{
		System.out.println("After class annotated method m4");
	}
	
}
 class SubClass extends TestAnnotationAtClassLevel
{
	 public void subClassMethod1()
	 {
		 System.out.println("subClassMethod - 1");
	 }
	 
	 public void subClassMethod2()
	 {
		 System.out.println("sub class method - 2");
	 }
	 
	 public void subClassMethod3()
	 {
		 System.out.println("sub class method - 3");
	 }
	
}
