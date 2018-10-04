package com.qa.pahub;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NBrokenLink {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.ie.driver","D:\\jar1\\IEDriverServer.exe");
	    WebDriver	driver = new InternetExplorerDriver();
	   // System.setProperty("webdriver.chrome.driver","D:\\jar1\\chromedriver.exe");
	    //WebDriver  driver = new ChromeDriver();
	    //System.setProperty("webdriver.gecko.driver","D:\\jar1\\geckodriver.exe");
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
//		driver.get("https://www.freecrm.com/index.html");
//		driver.findElement(By.name("username")).sendKeys("csunil");
//		driver.findElement(By.name("password")).sendKeys("Mummy@pratibha");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//		driver.switchTo().frame("mainpanel");
		driver.get("https://qa.pahub.com");
		Thread.sleep(10000);
		WebElement userName = driver.findElement(By.xpath("//*[@id='txtLoginId']")); 
	//userName.sendKeys("pk_4ds");
		userName.sendKeys("us_support");

		WebElement passWord = driver.findElement(By.xpath("//*[@id='txtPassword']"));
	//passWord.sendKeys("Pahub@3456");
		passWord.sendKeys("Support%123");

		WebElement loginButton = driver.findElement(By.xpath("//a//input[@alt='Login']"));
		loginButton.click();
		Thread.sleep(10000);
		
		// 1.get the list of all links and images
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("size of full links and images " + linkList.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		
		//2. iterate linksList : exclude all the  links/image  - doesn't have any href .
		
		for(int i = 0;i<linkList.size();i++) {
			System.out.println(linkList.get(i).getAttribute("href"));
			
			if(linkList.get(i).getAttribute("href") != null) {
				activeLinks.add(linkList.get(i));
			}
		}
		
		//get the size of of active links list
		System.out.println("size of active links " + linkList.size());
		
		//check the href url,with httpconnection api :
		for(int j = 0;j<activeLinks.size();j++) {
		
		HttpURLConnection connection =  (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		
		connection.connect();
		
		String response = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activeLinks.get(j).getAttribute("href") + "----> " + response);
	
		driver.close();
	}
		}}