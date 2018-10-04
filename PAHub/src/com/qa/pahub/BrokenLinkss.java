package com.qa.pahub;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class BrokenLinkss {
	WebDriver driver;
	@Test
	public void setUp() {
	System.setProperty("webdriver.ie.driver","D:\\Jar\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.get("https://qa.pahub.com");
	WebElement userName = driver.findElement(By.id("txtLoginId"));
	userName.sendKeys("us_support");
	WebElement passWord = driver.findElement(By.id("txtPassword"));
	passWord.sendKeys("Support%123");
	WebElement loginButton = driver.findElement(By.xpath("//input[@id='login_r4_c3']"));
	loginButton.click();
	List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
	for(WebElement e : listOfLinks) {
	 System.out.println(listOfLinks.size());
	 System.out.println("attribute of the link is " + e.getAttribute("href"));
	driver.quit();
	}
	
	
	}

}
