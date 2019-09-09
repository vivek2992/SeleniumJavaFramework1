import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		caps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "https://www.google.com/");
		
		System.setProperty("webdriver.ie.driver",projectPath+"\\drivers\\iedriver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver(caps);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("ABCD");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.close();
		
		driver.quit();
	}

}
