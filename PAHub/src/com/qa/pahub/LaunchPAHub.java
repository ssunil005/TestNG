package com.qa.pahub;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LaunchPAHub {
	WebDriver driver;
	
	@Test
	public void loginToPahub() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.ie.driver","D:\\jar1\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("https://qa.pahub.com");
		
		WebElement userName = driver.findElement(By.id("txtLoginId"));
		userName.sendKeys("pk_4ds");
		
		WebElement passWord  = driver.findElement(By.id("txtPassword"));
		passWord.sendKeys("Pahub@3456");
		
		Thread.sleep(10);
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login_r4_c3']"));
		loginButton.click();
		
        WebElement explicitWait = (new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_EocContentPlaceHolder_rBtnList_HcsType_0")));
//		WebElement element = explicitWait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("//input[@id='ctl00_EocContentPlaceHolder_rBtnList_HcsType_0']")));
		
		//Thread.sleep(10000);
        explicitWait.click();
//		WebElement PrescriptionDrugsRadioButton = driver.findElement(By.xpath("//input[@id='ctl00_EocContentPlaceHolder_rBtnList_HcsType_0']"));
//		PrescriptionDrugsRadioButton.click();
//		
        WebElement memberNumber = (new WebDriverWait(driver,20)).until(ExpectedConditions.visibilityOfElementLocated(By.id("txtSearchMemberNumber")));
		//WebElement memberNumber = driver.findElement(By.id("txtSearchMemberNumber"));
		memberNumber.sendKeys("000000001078460784");
		
		//WebElement manualPatient = driver.findElement(By.id("chkBoxManuallyAddedPatSearch"));
		//manualPatient.click();
		
		WebElement searchButton = driver.findElement(By.id("btnSearch"));
		searchButton.click();
		
		WebElement memberLink = driver.findElement(By.className("aLink"));
		memberLink.click();
		
//		WebElement editPlanInfo = driver.findElement(By.id("lnkPatientInfo"));
//		editPlanInfo.click();
//		
//		WebElement clientdd = driver.findElement(By.id("imgClient"));
//		clientdd.click();
		
		//Select dropdown = new Select(driver.findElement(By.id("mySelect")));
		//drop	
		//driver.findElement(By.xpath("//tr//td[@text(),'test@Magellan1']")).click();
		
		WebElement finalizeButton = driver.findElement(By.id("imgbtnFinalize"));
		finalizeButton.click();
		
		WebElement medIDSearch = driver.findElement(By.id("txtSearchMEDID"));
		medIDSearch.sendKeys("446836");
		
		WebElement HCSSearch = driver.findElement(By.id("imgSearch"));
		HCSSearch.click();
		
		WebElement SelectDrug = driver.findElement(By.linkText("ABILIFY 10 MG TABLET"));
		SelectDrug.click();
		
		WebElement nextButton = driver.findElement(By.id("imgDrugNext"));
		nextButton.click();
		
		WebElement hcsSummary = driver.findElement(By.id("lnkSummary"));
		hcsSummary.click();
		
		WebElement hcsFinalizeButton = driver.findElement(By.id("ImgFinalize"));
		hcsFinalizeButton.click();
		
		WebElement searchNPI = driver.findElement(By.id("txtSearchNPI"));
		searchNPI.sendKeys("1265409197");
		
		WebElement searchNPIButton = driver.findElement(By.id("btnSearch"));
		searchNPIButton.click();
		
		
				
		
		//driver.quit();
		//Runtime.getRuntime().exec("D:\\jar1\\IEDriverServer.exe");
		
		
		
		
	}

}
