package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNG_Demo2 {
	
	static WebDriver driver=null;
	
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public static void googleSearch2() {
				
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		}
	
	@Test
	public static void googleSearch3() {
				
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		}
	
	@AfterTest
	public void teardowntext() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
		
	}
	
}
