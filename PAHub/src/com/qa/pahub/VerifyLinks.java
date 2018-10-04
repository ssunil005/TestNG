package com.qa.pahub;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyLinks {
    static WebDriver driver;
	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver","D:\\jar1\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver","D:\\jar1\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		
		//driver.get("http://www.google.co.in/");
		driver.get("https://qa.pahub.com");
		
		WebElement userName = driver.findElement(By.id("txtLoginId"));
		userName.sendKeys("us_support");
		 
		WebElement passWord = driver.findElement(By.id("txtPassword"));
		 passWord.sendKeys("Support%123");
		 
		WebElement loginButton =  driver.findElement(By.id("login_r4_c3"));
		loginButton.click();
		
		WebDriverWait expWait =  new WebDriverWait(driver,20);
		WebElement element = expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_EocContentPlaceHolder_rBtnList_HcsType_0']")));
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
			System.out.println(url);
			
		}
		driver.close();
		
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
    } 
	
	
	 

}