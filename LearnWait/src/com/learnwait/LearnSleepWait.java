package com.learnwait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LearnSleepWait {
	
 static WebDriver driver;
	
//	@BeforeTest
//	public void setUp() {
////		System.setProperty("webdriver.gecko.driver","D:\\jar1\\geckodriver.exe");
////		driver = new FirefoxDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
//		
//	}
//It will execute after every test execution 
@AfterMethod
public void tearDown(ITestResult result) throws IOException,TimeoutException
{

//Here will compare if test is failing then only it will enter into if condition
if(ITestResult.FAILURE==result.getStatus())
{
try 
{
//Create refernce of TakesScreenshot
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

//Call method to capture screenshot
//File source=ts.getScreenshotAs(OutputType.FILE);

//Copy files to specific location here it will save all screenshot in our project home directory and
//result.getName() will return name of test case so that screenshot name will be same
FileUtils.copyFile(source, new File("D:\\CaptureScreen\\"+result.getName()+ " @ " + timeStamp + ".png"));

System.out.println("Screenshot taken");
} 
catch (Exception e)
{

System.out.println("Exception while taking screenshot "+e.getMessage());
} 

}
//close application
driver.quit();
}
	@Test
	public void redBus() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:/jar1/chromedriver.exe");
		driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in");
		//Thread.sleep(10000);
		//Thread.sleep(10000);
		System.out.println(driver.getTitle());
		System.out.println(new Date());
		//WebElement from = driver.findElement(By.id("//input[@id='src']"));
//		WebElement wait = new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.id("src")));
//		wait.sendKeys("Ban");
//		boolean title = new WebDriverWait(driver,20).until(ExpectedConditions.titleIs("Online Bus Tickets Booking, Book Volvo AC Bus Tickets, Confirmed Bus Reservation -redBus")); 
//		System.out.println(title);
//		WebElement from = driver.findElement(By.id("src"));
//		
//		from.sendKeys("Ban");
//		//Thread.sleep(10000);
//		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		
	}
	
	

}
