package com.learnwait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ExplicittWaitt {
	WebDriver driver;
	
/*	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE == result.getStatus()) {
			try {
				String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src,new File("D:\\CaptureScreen\\ " + timeStamp + ".png"));
				//System.out.println("Screenshot taken");
			}
			catch(Exception e) {
				System.out.println();
			}
		}
		driver.quit();
	}*/
@AfterMethod
public void tearDown(ITestResult result) {
	if(ITestResult.FAILURE == result.getStatus()) {
		try {
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("storage path \\" + timeStamp + "file format" ));
		}
		catch(Exception e) {
			System.out.println("caught exception while taking screen shot");
			}}
		}
	@Test
	public void conceptsOfExplicitWWait() {
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("disable-notification");
		System.setProperty("webdriver.chrome.driver","D:\\jar1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.twitter.com");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		boolean title = new WebDriverWait(driver,10).until(ExpectedConditions.titleIs("abc"));
		System.out.println(title);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.pollingEvery(2,TimeUnit.SECONDS);
		wait.ignoring(IOException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		
	}

}
