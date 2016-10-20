//package TestScripts;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.LocalFileDetector;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.RemoteWebElement;
//
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.io.File;
//import java.util.*;
//import java.util.logging.Logger;
//
//public class UploadFileusingLocalFiledetector {
//
// RemoteWebDriver driver;
// RemoteWebElement element;
//
//	
//	@BeforeTest
//	public void setUP() throws InterruptedException{
//		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\sharvari.bhosale\\Sample workspace\\MySampleWork\\Driver\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		Thread.sleep(200);
//		 Logger myLogger = Logger.getLogger(SimpleTest.class.getName());
//		driver.get("http://kshop/MyKshop/ASPX/MyKshopSubmission.aspx");
//		Thread.sleep(20);
//		
//	}
//	@Test 
//	public void uploadFile() throws InterruptedException{
//		
//		driver.findElement(By.cssSelector("input.clsFileUpload")).click();
//		/*driver.setLogLevel(Level.ALL);*/
//		
//
//		System.out.println(driver.getCurrentUrl());
//		WebElement element = driver.findElement(By.xpath("//input[contains(@class='clsFileUpload')]"));
//		Thread.sleep(20);
//		LocalFileDetector detector = new LocalFileDetector();
//		String path = "\\C:\\Users\\sharvari.bhosale\\Desktop\\note.txt";
//		File f = detector.getLocalFile(path);
//		((RemoteWebElement)element).setFileDetector(detector);
//		element.sendKeys(f.getAbsolutePath());
//	//	driver.findElementByXPath("//html/body/div[9]/div[1]/a/span").click();
//		
//	}
//	
//}
