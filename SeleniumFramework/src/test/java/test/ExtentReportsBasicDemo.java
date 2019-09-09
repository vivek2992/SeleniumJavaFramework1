package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
			
		ExtentTest test1 = extent.createTest("Google Search Test One","This is a test to validate Google Search Functionality");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		test1.log(Status.INFO,"Starting Test Case");
		driver.get("https://www.google.com/");
		test1.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Entered in Textbox");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test1.pass("Pressed ENTER key on keyboard");
		driver.close();
		driver.quit();
		test1.pass("Closed the browser");
		test1.info("Test Completed");
		
		
		ExtentTest test2 = extent.createTest("Google Search Test Two","This is a test to validate Google Search Functionality");
		
		driver = new ChromeDriver();
		test2.log(Status.INFO,"Starting Test Case");
		driver.get("https://www.google.com/");
		test2.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test2.pass("Entered in Textbox");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test2.fail("Pressed ENTER key on keyboard");
		driver.close();
		driver.quit();
		test2.pass("Closed the browser");
		test2.info("Test Completed");
		
		extent.flush();
	}

}
