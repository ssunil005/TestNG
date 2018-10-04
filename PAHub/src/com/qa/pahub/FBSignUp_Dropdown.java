package com.qa.pahub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FBSignUp_Dropdown {
	WebDriver driver;
	
	@Test
	public void dropDownTest() {
		System.setProperty("webdriver.chrome.driver","D:\\jar1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
		
		WebElement firstName = driver.findElement(By.id("u_0_j"));
		firstName.sendKeys("sunill");
		
		WebElement surName = driver.findElement(By.id("u_0_l"));
		surName.sendKeys("kumarr");
		
		WebElement mobileNumber = driver.findElement(By.id("u_0_o"));
		mobileNumber.sendKeys("9342712050");
		
		WebElement passWord = driver.findElement(By.id("u_0_v"));
		passWord.sendKeys("kumar123@123");
		
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByValue("23");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("12");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1989");
		
		WebElement gender = driver.findElement(By.id("u_0_9"));
		gender.click();
		
		driver.close();
				
		
	}

}
