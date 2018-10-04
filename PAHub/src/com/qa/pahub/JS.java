package com.qa.pahub;

import org.openqa.selenium.chrome.ChromeDriver;

public class JS 
{
	
	public static void main(String[] args)
	{
		
	
	System.setProperty("webdriver.chrome.driver","D:/jar1/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.executeScript("console.log('Hello '+arguments[0] +' Welcome to '+arguments[1]);","Amod","MakeSeleniumEasy");

	}

}
