package com.qa.pahub;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PaisaBazaar {
	WebDriver driver;
	
	@BeforeMethod
public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\jar1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.paisabazaar.com");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	}
	@AfterMethod(enabled=true)
	public void tearDown() {
	//	driver.close();
	}
	@Test(alwaysRun = true)
	public void launchPaisaBazaarTest() throws IOException {
		driver.get("https://www.paisabazaar.com");
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,driver.getCurrentUrl(),"url didn't match");
		// Take screenshot and store as a file format
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		// now copy the screenshot to desired location using copyFile //method
//		FileUtils.copyFile(src, new File("D:/Jar/scr/google.png"));
//		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File(""));
//		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File(""));
//		File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File(""));
//		File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src3,new File("D:/jar/scrsht.png"));
//		
//		File src4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src4,new File(" destDirectory"));
//		
//		File src5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src5,new File(""));
		
		File src6 =( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src6,new File(" D://jar//g1.png"));
		
		File src7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src7,new File("D://google.png"));

	}
	@Test(enabled = true)																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
	public void  PaisaBazaarTitleTest()	{
		String title = driver.getTitle();
		System.out.println("title of the page is " + title);
		Assert.assertEquals(title,driver.getTitle(),"title didn't match");
		
	}
	@Test(invocationCount = 1)
	public void cardsTest() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver,10);
	//	wait.until(arg0)
		//WebElement cards = driver.findElement(By.xpath("(//a[@class=' dropdown-toggle '])[1]"));
	//	Thread.sleep(20);
		//WebElement cards = driver.findElement(By.xpath("(//li[normalize-space(@class='dropdown open')])[1]//a[contains(text(),'Debit Cards')]"));
		WebElement cards = driver.findElement(By.xpath("(//li[normalize-space(@class='dropdown open')])[1]"));

		//WebElement cards = driver.findElement(By.xpath("//li[@class='dropdown open']"));
		//a[contains(text(),'Hot Network')]

		cards.click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(src,new File("D:\\CaptureScreen\\google.png"));
	}

	
}
