package com.qa.pahub;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TestLink {
	private WebDriver driver;
	private int invalidLinksCount;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.ie.driver","D:\\jar1\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get("https://qa.pahub.com/");
		WebElement userName =  driver.findElement(By.id("txtLoginId"));
		userName.sendKeys("us_support");
		WebElement passWord = driver.findElement(By.id("txtPassword"));
		passWord.sendKeys("Support%123");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login_r4_c3']"));
		loginButton.click();


	}
	@Test
	public void validateInvalidLinks() {    
		try {
			invalidLinksCount = 0;
			List<WebElement> anchorTagList = driver.findElements(By.tagName("a"));
			System.out.println("total number of links are " + anchorTagList.size());
			for(WebElement anchorTagElement : anchorTagList) {
				if(anchorTagElement != null) {
					String url = anchorTagElement.getAttribute("href");
					if(url != null && !url.contains("javascript")) {
						verifyURLStatus(url);
					}else {
						invalidLinksCount++;
					}
				}
			}
			System.out.println("Total no. of invalid links are "
					+ invalidLinksCount);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	@AfterClass
	public void tearDown() {
		if (driver != null)
			driver.quit();
	}

	public void verifyURLStatus(String URL) {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(URL);
		try {
			HttpResponse response = client.execute(request);
			// verifying response code and The HttpStatus should be 200 if not,
			// increment invalid link count
			////We can also check for 404 status code like response.getStatusLine().getStatusCode() == 404
			if (response.getStatusLine().getStatusCode() != 200)
				invalidLinksCount++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}