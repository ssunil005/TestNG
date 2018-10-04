package com.qa.pahub;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PahubDropDown 
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp() 
	{
		System.setProperty("webdriver.ie.driver","D:\\jar1\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void PAHubDropdownTest() throws Exception 
	{
		driver.get("https://qa.pahub.com");
		driver.findElement(By.id("txtLoginId")).sendKeys("pk_4ds");
		driver.findElement(By.id("txtPassword")).sendKeys("Pahub@3456");
		driver.findElement(By.id("login_r4_c3")).click();
		
		Thread.sleep(10);
		driver.findElement(By.id("ctl00_EocContentPlaceHolder_rBtnList_HcsType_0")).click();
		Select select = new Select(driver.findElement(By.id("ddlSearchCountry")));
		select.selectByValue("AF");
		select.selectByValue("US");
		//System.out.println(select.getFirstSelectedOption());
		//System.out.println(select.getOptions());
		
		WebElement statedrpdn = driver.findElement(By.id("imgSrchState"));
		statedrpdn.click();
		
		WebElement statevalue = driver.findElement(By.xpath("//div//table//tbody//tr[2][text()='Alabama')"));
		statevalue.click();
		
//		WebElement  state = driver.findElement(By.id("txtSearchState"));
//		state.click();
		
//		Select select1 = new Select(driver.findElement(By.id("txtSearchState")));
//		select1.selectByIndex(2);
//		
/*		
		driver.findElement(By.id("txtSearchFirstName")).sendKeys("aubrey");
		driver.findElement(By.id("txtSearchLastName")).sendKeys("richey");
		driver.findElement(By.id("btnSearch")).click();
*/		
		
	}
	
	@AfterTest
	public void tearDown() 
	{
		//driver.close();
		
		
		
	}
	

}
