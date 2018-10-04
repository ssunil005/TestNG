package com.DefaultPriority;

import org.testng.annotations.Test;

public class MixedPriority {
	
	@Test(priority = -1)
	public void m1withpriority()
	{
		System.out.println("m1 with priority");
		
	}
	
	// TestNG will assign zero as priority to this method
	 @Test
	 public void mehodWithoutPriority()
	 {
		 System.out.println("method without priority");
	 }
	 
	 /*There is a tie between methodwithoutpriority & disprintmethodwithoutpriority .
	 so TestNG will use here ASCII rule to decide which method to be run first.
	 Since, ASCII of 'D' is 68 & ASCII of 'p' is 80. so,method disprintmethodwithoutpriority
	 will be executed first as it has the lowest ASCII.*/
	 
	 
	 @Test
	 public void  disPrintMethodWithoutPriority()
	 {
		 System.out.println("dis method has no priority");
	 }
	 
	 @Test(priority = 1)
	 public void m4WithPriority()
	 {
		 System.out.println("this method's priority is 1");
	 }

}
