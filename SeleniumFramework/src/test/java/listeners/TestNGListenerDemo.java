package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo
{
	@Test
	public void Test1()
	{
		System.out.println("I am inside Test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("I am inside Test2");
		
		String projectPath = System.getProperty("user.dir");
						
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.google.com/");
				
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@name=\"abc\"]")).sendKeys("abc");
		
		driver.close();
	}
	@Test
	public void Test3()
	{
		System.out.println("I am inside Test3");
		throw new SkipException("This test is skipped");
	}
	
	
}
