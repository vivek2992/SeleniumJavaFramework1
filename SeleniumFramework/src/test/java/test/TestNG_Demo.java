package test;

import org.testng.annotations.Test;

import config.PropertiesFile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNG_Demo {
	
	static WebDriver driver=null;
	public static String browserName=null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
	}
	
	@Test
	public static void googleSearch() {
				
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		}
	
	@AfterTest
	public void teardowntext() {
		driver.close();
		//driver.quit();
		System.out.println("Test Completed Successfully");
		PropertiesFile.setProperties();
	}
	
}
