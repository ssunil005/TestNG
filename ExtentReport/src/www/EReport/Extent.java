package www.EReport;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class Extent {
	WebDriver driver;





���� @Test
���� public void verifySeleniumBlog(){



���������� // Create object of extent report and specify the Class name in get method

���������� // in my case I have used AdvanceReporting.class

���������� ExtentReports extent = ExtentReports.get(AdvanceReporting.class);



���������� // Call init method and specify the location where you want to save this report

���������� // second parameter is set to true it means it will overwrite report with new one

���������� extent.init("D:\\CaptureScreen\\myreport.html", true);



���������� // Start Test

���������� extent.startTest("Verify Page Title");





���������� // Start browser

����������  driver=new FirefoxDriver();

���������� driver.manage().window().maximize();

���������� extent.log(LogStatus.INFO, "Browser started");



���������� // Open application

���������� driver.get("http://learn-automation.com");

���������� extent.log(LogStatus.INFO, "Navigated to www.learn-automation.com");



���������� // get title

���������� String title=driver.getTitle();

���������� extent.log(LogStatus.INFO, "Get the current title");



���������� // Verify title

���������� �Assert.assertTrue(title.contains("Selenium"));

���������� �extent.log(LogStatus.PASS, "Title verified");
���������� �// In case you want to attach screenshot then use below method

���������� �// I am taking random image but you have to take screenshot at run time and specify the path
���������� �extent.attachScreenshot("C:\\Mukesh\\image1.jpg");
���������� �// Close application
���������� �driver.quit();
���������� �extent.log(LogStatus.INFO, "Browser closed");
���������� �// close report

���������� �extent.endTest();


}
���� }
}