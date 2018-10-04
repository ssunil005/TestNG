package com.qa.pahub;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	WebDriver driver;
	
	String baseURL = "https://www.google.com";
	@Parameters({"browser"})	
	@BeforeTest
		public void openBrowser(String browser) {
			try {
				if (browser.equalsIgnoreCase("Firefox")) {
					System.setProperty("webdriver.gecko.driver","D:\\jar1\\geckodriver.exe");
					driver = new FirefoxDriver();
				} else if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver","D:\\jar1\\chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase("IE")) {
					System.setProperty("webdriver.ie.driver","D:\\jar1\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}
			
			} catch (WebDriverException e) {
				System.out.println(e.getMessage());
			}
		}

		@Test
		public void login_TestCase() {
			driver.navigate().to(baseURL);
	                //do something
		}

		@Test
		public void search_TestCase() {
			driver.navigate().to(baseURL);
	             //do something
		}

		@AfterTest
		public void closeBrowser() {
			driver.quit();
		}
	
	}


