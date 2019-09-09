package Demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {
	
	public static void main(String[] args) throws InterruptedException {
		test();
	}
	
	public static void test() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
				
		//driver.findElement(By.xpath("//*[@id='nav']/tbody/tr/td[3]/a/span")).click();
		
		
		//driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH")).click();
		
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(2, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       WebElement linkelement =  driver.findElement(By.xpath("//*[@id=\'rso\']/div/div/div[8]/div/div/div[1]/a/h3/div"));
		       
		       if(linkelement.isEnabled()) {
		    	   System.out.println("Element Found");
		       }
		       return linkelement;
		     }
		   });
		   
		element.click();
		   
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
