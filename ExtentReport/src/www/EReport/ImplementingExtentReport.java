package www.EReport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
public class ImplementingExtentReport {
	
	static WebDriver driver;
	
//	@BeforeMethod
//	public void setUp() {
//		System.setProperty("webdriver.chrome.driver","D:\\jar1\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.navigate().to("https://www.twitter.com");
//		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
//	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void cTest()throws IOException {
		System.setProperty("webdriver.chrome.driver","D:/jar1/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get("https://www.twitter.com");
		
//      String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());


        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src,new File("D:/CaptureScreen/" + timeStamp + ".png"));
		
	}
	@Test
	public void fFTest()throws IOException {
		System.setProperty("webdriver.gecko.driver","D:/jar1/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://www.twitter.com");
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

		
		String timeStamp = new SimpleDateFormat("yyyy.MM.ss.HH.mm.ss").format(new java.util.Date());
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D:/CaptureScreen/ " + timeStamp + ".png"));
	//	FileUtils.copyFile(src,new File("D://CaptureScreen//" + new java.util.Date() +".png"));
	
	}
	@Test
	public void extentTest() {
	//	Extentreports exReport;
	}
}
