package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jetty.util.ajax.JSON;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.steadystate.css.parser.Locatable;


public class CrossBrowserTest {
	
	WebDriver driver1;
	String baseurl,nodeurl;
	RemoteWebDriver driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException{
		baseurl="www.redbus.com";
		nodeurl=" http://10.76.171.155:5566/wd/hub";
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\sharvari.bhosale\\Sample workspace\\MySampleWork\\Driver\\chromedriver.exe");
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL(nodeurl),cap);
		driver.manage().window().maximize();
	}
	
	
/*	@Parameters("browser")
	public void verifyPageTtle(String browserName)
	
	{
	if(browserName.equalsIgnoreCase("firefox'"))
		
	{
		driver =new FirefoxDriver();
	}
	
if(browserName.equalsIgnoreCase("chrome'"))
		
	{
	System.setProperty("webdriver.chrome.driver","\\C:\\Users\\sharvari.bhosale\\Sample workspace\\MySampleWork\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
	}
if(browserName.equalsIgnoreCase("IE'"))
	
{
	System.setProperty("webdriver.ie.driver","\\C:\\Users\\sharvari.bhosale\\Sample workspace\\MySampleWork\\Driver\\IEDriverServer.exe");
	driver =new InternetExplorerDriver();
}
	
	}*/
	
	
	@Test
		public void launchapp(){
		driver.get(baseurl);
		driver.getTitle();
		
		Locatable hoverIte = (Locatable) driver.findElement(By.xpath(""));
		Mouse mouse = ((HasInputDevices)driver).getMouse();
		mouse.click((Coordinates) hoverIte);
		
	}
	
	@AfterTest
	
	public void afterTest(){
		driver.quit();
	}
	

}
