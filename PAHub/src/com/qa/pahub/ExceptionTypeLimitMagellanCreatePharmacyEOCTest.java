package com.qa.pahub;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ExceptionTypeLimitMagellanCreatePharmacyEOCTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.ie.driver","D:\\jar1\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void magellanCreatePharmacyEOCTest() throws InterruptedException  
	{
	    JavascriptExecutor js = (JavascriptExecutor)driver;

		//driver.get("https://qa.pahub.com");    //QA Environment
		//Assert.assertEquals("Pahub",driver.getTitle());
		
		driver.get("https://pilot.pahub.com/login.aspx");   //Pilot Environment
		WebElement element = (WebElement) js.executeScript("return document.getElementById('txtLoginId')");
		//element.sendKeys("pk_4ds");//QA userID
		element.sendKeys("sl_4ds");//Pilot userID
		

//		
//		WebElement LoginID = new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated((By.id("txtLoginId"))));
//		LoginID.sendKeys("pk_4ds");
//		
		WebElement password = new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.id("txtPassword")));
		// password.sendKeys("Pahub@3456");//QA login password
		password.sendKeys("Admin@1234");//pilot login password
		
		
		WebElement Login = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("login_r4_c3")));
		Login.click();
		   
		
		WebElement prescriptionDrugs = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("ctl00_EocContentPlaceHolder_rBtnList_HcsType_0")));
		prescriptionDrugs.click();
		
		WebElement memberNumber = new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.id("txtSearchMemberNumber")));
		//memberNumber.clear();
		memberNumber.sendKeys("000000001078460784");
		//memberNumber.sendKeys("5858585858");
		
//		WebElement ManuallyAddedPatient = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("tdchkBoxManuallyAddedPatSearch")));
//		ManuallyAddedPatient.click();
		
		WebElement search = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("btnSearch")));
		search.click();
		
		WebElement patientName = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.linkText("AUBREY RICHEY")));
		patientName.click();
		
		WebElement patSummFinalize = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("imgbtnFinalize")));
		patSummFinalize.click();

		WebElement HCSMEDID = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("txtSearchMEDID")));
		HCSMEDID.clear();
		HCSMEDID.sendKeys("446836");
		
		WebElement HCSDrugSearch = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("imgSearch")));
		HCSDrugSearch.click();
		
		WebElement drugName = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.linkText("ABILIFY 10 MG TABLET")));
		drugName.click();
		
		WebElement pharmacyRadioBtn = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("rdlPharmacyNo")));
		pharmacyRadioBtn.click();
		
		WebElement nextBtn = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("imgDrugNext")));
        nextBtn.click();	
        
        Boolean HcsPageTitle = new WebDriverWait(driver,20).until(ExpectedConditions.titleIs("HealthCareServices"));
        System.out.println("s dslayed" + HcsPageTitle);
        
        WebElement HcsSummary = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("lnkSummary")));
        HcsSummary.click();
        

        WebElement HcsFinalize = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("ImgFinalize")));
        HcsFinalize.click();


        WebElement PhysiciannpiSearch = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("txtSearchNPI")));
        PhysiciannpiSearch.sendKeys("1265409197");
        

        WebElement Physiciansearchbtn = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("btnSearch")));
        Physiciansearchbtn.click();
        
        WebElement PhysiciansearchRes = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.linkText("Scott Love")));
        PhysiciansearchRes.click();
        
        WebElement PhysicianFinalize = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("imgFinalize")));
        PhysicianFinalize.click();
        System.out.println("clicked on Physician Finalize button");
        
//        Boolean AIPage = new WebDriverWait(driver,20).until(ExpectedConditions.titleIs("AdditionalInfo Page"));
//        System.out.println(AIPage);

        WebElement AdditionalInfoPage = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("ctl00_EocContentPlaceHolder_ddlRequestor")));
        Assert.assertEquals(driver.getTitle(),"AdditionalInfo Page");
        System.out.println(driver.getTitle());
        
        Thread.sleep(10);
        Select selectRequestor = new Select(driver.findElement(By.id("ctl00_EocContentPlaceHolder_ddlRequestor")));
        selectRequestor.selectByVisibleText("Patient");
        System.out.println("selected patient as requestor");
        
        Thread.sleep(10);

        WebElement ddlRequestOrigin = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_EocContentPlaceHolder_ddlRequestOrigin")));
        Select selectrequestOrigin = new Select(driver.findElement(By.id("ctl00_EocContentPlaceHolder_ddlRequestOrigin")));
        selectrequestOrigin.selectByVisibleText("Retail");
        
        Thread.sleep(10);

        WebElement eOCSource  = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_EocContentPlaceHolder_ddlDefaultSource")));
        Select selecteOCSource = new Select(driver.findElement(By.id("ctl00_EocContentPlaceHolder_ddlDefaultSource")));
        selecteOCSource.selectByVisibleText("Phone");
        
        Thread.sleep(10);

        WebElement Location  = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("ctl00_EocContentPlaceHolder_ddlDefaultSource")));
	//	WebElement element = (WebElement) js.executeScript("return document.getElementById('ctl00_EocContentPlaceHolder_ddlDefaultSource')");

      //  Select selectLocation = new Select(driver.findElement(By.id("ctl00_EocContentPlaceHolder_ddlDefaultSource")));
       // Select selectLocation = new Select((WebElement) js.executeScript("return document.getElementById('ctl00_EocContentPlaceHolder_ddlDefaultSource')"));
     //   selectLocation.selectByVisibleText("LTC");
       // selectLocation.selectByValue("3");
        Thread.sleep(10);

        
        WebElement w = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_EocContentPlaceHolder_ddlUrgency")));
        Select selectUrgency = new Select(driver.findElement(By.id("ctl00_EocContentPlaceHolder_ddlUrgency")));
     //   selectUrgency.selectByIndex(1);
        selectUrgency.selectByVisibleText("Yes");
        
        WebElement w1 = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_EocContentPlaceHolder_ddlCaseType")));

        Select selectCaseType = new Select(driver.findElement(By.id("ctl00_EocContentPlaceHolder_ddlCaseType"))); 
        selectCaseType.selectByVisibleText("Concurrent");    
       // ((WebElement) selectCaseType).sendKeys("Concurrent");
        
        Thread.sleep(10);

        WebElement w2 = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_EocContentPlaceHolder_ddlExceptionType")));
        Select selectExceptionType = new Select(driver.findElement(By.id("ctl00_EocContentPlaceHolder_ddlExceptionType")));
		List<WebElement> options = selectExceptionType.getOptions();
		for(WebElement option : options) {
			option.click();
			//d.findElement(By.id("btnviewqueue")).click();
			//d.findElement(By.id("imgBtn_ExpToExcel")).click();
			System.out.println(option.getText());
		}

        
   
        
        
      //  ctl00_EocContentPlaceHolder_ddlExceptionType  
        
        
     //   ctl00_EocContentPlaceHolder_ddlUrgency
        
        
//        WebElement step3bNextBtn = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("imgProductNext")));
//        step3bNextBtn.click();
        //ctl00_EocContentPlaceHolder_ddlUrgency
        //        WebElement step3cNextBtn = new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.id("img5")));
//        step3cNextBtn.click();
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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

			System.out.println("Exception while taking screenshot " + e.getMessage());
			
			} 


			}
		
		
		driver.close();
	}

}