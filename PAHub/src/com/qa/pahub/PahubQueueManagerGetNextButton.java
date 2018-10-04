package com.qa.pahub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PahubQueueManagerGetNextButton 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.ie.driver","D:\\jar1\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("https://qa.rxcontinuum.com/PAHubQAv40/");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void PAHubloginTest()
	{
		
		
		WebElement userName = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("txtLoginId")));
		userName.sendKeys("");
		
		WebElement passWord = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPassword")));
		passWord.sendKeys("Pahub@3456");
		
		WebElement loginButton = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("login_r4_c3")));
		loginButton.click();
		
		//Assert.assertEquals("PaHub - Main",driver.getTitle(),"Titlenotmatched");
	}
	@Test
	public void PAHubQueueManagerGetNextTest() 
	{
		WebElement queueManager = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.linkText("Queue Manager")));
		queueManager.click();
		
		
	}
	
	

}
