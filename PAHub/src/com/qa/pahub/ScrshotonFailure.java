// Create a package in eclipse
package com.qa.pahub;

// Import all classes and interface
import java.io.File;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScrshotonFailure {

// Create Webdriver reference
WebDriver driver;

@Test
public void SUNIL() throws Exception
{

// Initiate Firefox browser
	System.setProperty("webdriver.chrome.driver","D:/jar1/chromedriver.exe");
driver=new ChromeDriver();

// Maximize the browser
driver.manage().window().maximize();

// Pass application url
driver.get("http://www.google.com");

// Here we are forcefully passing wrong id so that it will fail our testcase
driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");

}


@Test
public void twitterLoginTest() {
	System.setProperty("webdriver.chrome.driver","D:/jar1/chromedriver.exe");
driver=new ChromeDriver();
	driver.get("https://www.twitter.com");
	driver.findElement(By.id("twiter")).sendKeys("sunil");
}
// It will execute after every test execution 
@AfterMethod
public void tearDown(ITestResult result)
{

// Here will compare if test is failing then only it will enter into if condition
if(ITestResult.FAILURE==result.getStatus())
{
try 
{
// Create refernce of TakesScreenshot
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

// Call method to capture screenshot
//File source=ts.getScreenshotAs(OutputType.FILE);

// Copy files to specific location here it will save all screenshot in our project home directory and
// result.getName() will return name of test case so that screenshot name will be same
FileUtils.copyFile(source, new File("D:\\CaptureScreen\\"+result.getName()+ " @ " + timeStamp + ".png"));

System.out.println("Screenshot taken");
} 
catch (Exception e)
{

System.out.println("Exception while taking screenshot "+e.getMessage());
} 

}
// close application
driver.quit();
}



}