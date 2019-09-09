package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	static WebDriver driver = null;
	public static void main(String[] args) {
		
		GoogleSearchTest();
		
	}
	
	
	public static void GoogleSearchTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchpageobj = new GoogleSearchPageObjects(driver);
	
		driver.get("https://www.google.com/");
		
		searchpageobj.setTextInSearchBox("A B C D");
		
		searchpageobj.clickSearchButton();
		
		driver.close();
		
	}
	
}
