package com.qa.pahub;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CreateLangPrefEOC 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.ie.driver","D:\\jar1\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void createEOCTest() 
	{
		driver.get("https://qa.pahub.com");
		//Assert.assertEquals("Pahub",driver.getTitle());
		
		WebElement LoginID = new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated((By.id("txtLoginId"))));
		LoginID.sendKeys("pk_4ds");
		
		WebElement password = new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.id("txtPassword")));
		password.sendKeys("Pahub@3456");
		
		WebElement Login = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("login_r4_c3")));
		Login.click();
		   
		WebElement prescriptionDrugs = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("ctl00_EocContentPlaceHolder_rBtnList_HcsType_0")));
		prescriptionDrugs.click();
		
		WebElement memberNumber = new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.id("txtSearchMemberNumber")));
		memberNumber.clear();
		memberNumber.sendKeys("000000001078460784");
		
		WebElement search = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("btnSearch")));
		search.click();
		
		WebElement patientName = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.linkText("AUBREY RICHEY")));
		patientName.click();
		
		WebElement patSummFinalize = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("imgbtnFinalize")));
		patSummFinalize.click();
		
		//Boolean HCSLoad = new WebDriverWait(driver,10).until(ExpectedConditions.titleIs("HealthCareServices"));
		Boolean HCSLoad = new WebDriverWait(driver,10).until(ExpectedConditions.titleIs("HealthCareServices"));

		WebElement HCSMEDID = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("txtSearchMEDID")));
		HCSMEDID.clear();
		HCSMEDID.sendKeys("446836");
		
		WebElement HCSDrugSearch = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("imgSearch")));
		HCSDrugSearch.click();
		
		WebElement drugName = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.linkText("ABILIFY 10 MG TABLET")));
		drugName.click();
		
		WebElement pharmacyRadioBtn = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("rdlPharmacy")));
		pharmacyRadioBtn.click();
		
		WebElement nextBtn = new WebDriverWait(driver,10) .until(ExpectedConditions.elementToBeClickable(By.id("imgDrugNext")));
	    nextBtn.click();
	    
	   // WebElement imgDrugNext
		
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
			try
			{
				String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
				File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				// result.getName() will return name of test case so that screenshot name will be same
				FileUtils.copyFile(source, new File("D:\\CaptureScreen\\"+result.getName()+ " @ " + timeStamp + ".png"));

				System.out.println("Screenshot taken");
			} 
			catch (Exception e)
			{

			System.out.println("Exception while taking screenshot "+e.getMessage());
			} 


			}
		
		driver.close();
	}

}