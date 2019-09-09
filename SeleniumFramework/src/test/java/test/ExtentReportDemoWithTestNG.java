package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemoWithTestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
	@BeforeSuite
	public void setup() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();	
		extent.attachReporter(htmlReporter);
		
	}
	
	
	@BeforeTest
	public void BeforeTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
	@Test
	public void test1() throws IOException {
		
		
		ExtentTest test = extent.createTest("Google Search Test One","This is a test to validate Google Search Functionality");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		test.log(Status.INFO,"");
		test.info("Info");
		test.fail("Fail", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	
	public void AfterTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
	}
	
	@Test
	public void test2() throws IOException {
		
		ExtentTest test = extent.createTest("Google Search Test One","This is a test to validate Google Search Functionality");
		
		test.log(Status.INFO,"");
		test.info("Info");
		test.pass("Fail", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterSuite
	public void teardown() {
		extent.flush();
	}
	
}
