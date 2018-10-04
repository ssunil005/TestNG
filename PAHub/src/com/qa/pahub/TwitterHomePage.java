package com.qa.pahub;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TwitterHomePage {
	static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\jar1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public  void TwitterHomePageTest() throws Exception {
		driver.get("https://twitter.com/login/");
		Object browserName = ((RemoteWebDriver) driver).executeScript("return navigator.userAgent","");
		System.out.println(browserName);
		
		WebDriverWait eWait = new WebDriverWait(driver,5);
		Boolean element = eWait.until(ExpectedConditions.titleIs("Login on Twitter"));
		System.out.println(element.booleanValue());
		
		WebDriverWait eWait1 = new WebDriverWait(driver,10);
		WebElement e1 = eWait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@type='submit']"))));
		e1.click();
		
		takingScreenShot();
	}
	
	//method to take screen-shot	
	public  void takingScreenShot() throws IOException {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
       // System.out.println(timeStamp);


    File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile, new File("D:\\CaptureScreen\\ " + timeStamp + ".jpg"));
		
		}
	
	WebDriverWait wait = new WebDriverWait(driver,20);
	//WebElement e = wait.until(ExpectedConditions.class);
	
@Test
public void loginToTwitter() throws IOException {
	driver.get("https://twitter.com/");
//	WebDriverWait eWait2 = new WebDriverWait(driver,20);
//	Boolean title1 = eWait2.until(ExpectedConditions.titleIs("Twitter. It&#39;s what&#39;s happening."));	
//	System.out.println(title1);
	WebDriverWait eWait3 = new WebDriverWait(driver,10);
	//WebElement element = 
	eWait3.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Sign Up"))));
//	element.click();
	
	takingScreenShot();
}

}