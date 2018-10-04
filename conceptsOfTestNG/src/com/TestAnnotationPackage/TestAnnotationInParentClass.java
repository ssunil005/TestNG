package com.TestAnnotationPackage;
import org.testng.annotations.*;

@Test
class  ParentClass
{
		

}
public class TestAnnotationInParentClass extends ParentClass
{
	public void method1()
	{
		System.out.println("method1");
	}
	
	@BeforeClass
	public void method2()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void method3()
	{
		System.out.println("AfterClass");
	}
	
	public void method4()
	{
		System.out.println("method4");
	}
	
}
