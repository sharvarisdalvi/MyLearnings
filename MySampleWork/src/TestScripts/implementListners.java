package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestScripts.LISTNER.class)
public class implementListners {

	static WebDriver driver;
	@Test
	public static void main(String[]arg) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\sharvari.bhosale\\Sample workspace\\MySampleWork\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.get("https://www.redbus.in/");
		Thread.sleep(100);
		driver.getTitle();
		driver.quit();
	}
	
}
