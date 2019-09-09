package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 
public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		SeleniumWaits();
	}
	
	public static void SeleniumWaits() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//250ms
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		driver.findElement(By.name("abcd")).click();
		
		driver.close();
		driver.quit();
	}
}
