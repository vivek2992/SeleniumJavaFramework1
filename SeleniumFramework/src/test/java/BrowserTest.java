

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
	
		//String projectPath = System.getProperty("user.dir");
		
		//System.out.println(projectPath);
		
		//System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
	
		//System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver",projectPath+"\\drivers\\iedriver\\IEDriverServer.exe");
		
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
			
		
		//WebElement textbox = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		
		List <WebElement> listofinputs = driver.findElements(By.xpath("//input"));
		
		System.out.println(listofinputs.size());
		
		/*
		 * textbox.sendKeys("Automation Step by Step");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.close();
		 */
		
	}
	
}
