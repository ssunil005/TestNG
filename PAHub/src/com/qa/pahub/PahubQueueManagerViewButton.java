package com.qa.pahub;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PahubQueueManagerViewButton {
	@Test
	public void test() throws Exception {
		WebDriver d; 
	
		System.setProperty("webdriver.ie.driver","D:\\jar1\\IEDriverServer.exe");
		d = new InternetExplorerDriver();
		d.manage().window().maximize();
		
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		//d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//d.get("https://qa.pahub.com");
		//d.get("https://qa.rxcontinuum.com/PAHubQAv40");
		d.get("https://qa.pahub.com");// QA
	//	d.get("https://pilot.pahub.com/login.aspx");   //Pilot
		Thread.sleep(10000);
		WebElement userName = d.findElement(By.xpath("//*[@id='txtLoginId']")); 
	    userName.sendKeys("pk_4ds");    //gt_davita/
		//userName.sendKeys("us_support");

		WebElement passWord = d.findElement(By.xpath("//*[@id='txtPassword']"));
	passWord.sendKeys("Pahub@3456");
	//passWord.sendKeys("");

		WebElement loginButton = d.findElement(By.xpath("//a//input[@alt='Login']"));
		loginButton.click();
		
//		String alertText = d.switchTo().alert().getText();
//		System.out.println(alertText);
		
		Thread.sleep(10000);
		WebElement queueManager = d.findElement(By.xpath("(//a[@class='ctl00_EocUsercontrol_menuMain_1 ctl00_EocUsercontrol_menuMain_3'])[1]"));
		queueManager.click();
	WebElement selectMyValue = new WebDriverWait(d,20).until(ExpectedConditions.elementToBeClickable(By.id("ddlQueue")));
	//WebElement loginButton = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("login_r4_c3")));
		Select dropDown = new Select(selectMyValue);
		List<WebElement> options = dropDown.getOptions();
		System.out.println(options.size());
		
		for(WebElement option : options) {
			option.click();
			String Wq = "---Work Queues---";
			String  Vq = "---View Queues---";
			if(!option.getText().equalsIgnoreCase(Wq)|| !option.getText().equalsIgnoreCase(Vq) ) {
				System.out.println(option.getText());
			}
			else {
				//if(!option.getText().equalsIgnoreCase(Vq)) {
			
			//}
			d.findElement(By.id("btnviewqueue")).click();
			
			//d.findElement(By.id("imgBtn_ExpToExcel")).click();
			System.out.println(option.getText());
			
		
		//System.out.println(" Verified Queue manager view button for all queues ");

		
		
		System.out.println("Count of queues : " + options.size());
			}}

		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("D:/Jar/scr/google1.png"));
		d.quit();
	}
}