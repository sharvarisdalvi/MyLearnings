package Utils;

import java.io.File;


import java.io.IOException;
import java.io.ObjectOutput;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtils {
	public static WebDriver driver;
	
		 
	public static void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.bin",
					"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", " ");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "");
			driver = new InternetExplorerDriver();
		}
	}
	
	

	public static void navigateToUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	
	}
	
	public static String  getUrl() {
		 return driver.getCurrentUrl();
		
	}
	
	
	public  static By locatorValue(String locatorTpye, String value) {
		By by;
		switch (locatorTpye) {
		case "id":
			by = By.id(value);
			break;
		case "name":
			by = By.name(value);
			break;
		case "xpath":
			by = By.xpath(value);
			break;
		case "css":
			by = By.cssSelector(value);
			break;
		case "linkText":
			by = By.linkText(value);
			break;
		case "TagName":
			by = By.tagName(value);
			break;
		case "partialLinkText":
			by = By.partialLinkText(value);
			break;
		default:
			by = null;
			break;
		}
		return by;
	}

	public static void EnterText( String locatorTypeAndValue,
			String textToBeEnter) {
		
		WebElement element=getWebElement(locatorTypeAndValue);
		try {
			
			if(element.isDisplayed()||element.isEnabled())
				element.clear();
			element.sendKeys(textToBeEnter);
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}
	
	
	public static List<WebElement> getWebElements(String locatorType,String locatorValue)
	{
		try{
			By locator;
			locator = locatorValue(locatorType, locatorValue);
			List<WebElement> elementList = driver.findElements(locator);
			return elementList;
		}
		catch(Exception e)
		{
			System.out.println("There is on object avaialable in page using:"+locatorType+"and"+locatorValue);
		}
		return null;
		
	}
	
	public static WebElement getWebElement(String locatorTypeAndValue)
	{
	String [] all=	locatorTypeAndValue.split("\\=");

	String locatorType=	all[0].toString().trim();
	String locatorValue=	all[1].toString().trim();
	
		try{
			By locator;
			locator = locatorValue(locatorType, locatorValue);
			WebElement elementList = driver.findElement(locator);
			return elementList;
		}
		catch(Exception e)
		{
			System.out.println("There is on object avaialable in page using:"+locatorType+"and"+locatorValue);
		}
		return null;
		
	}
	public static void click(String locatorTypeAndValue)
	{
		try{
		//By locator;
		WebElement element=getWebElement(locatorTypeAndValue);
		element.click();
		}
		catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}
	
	public  static void closeBrowser()
	{
		driver.quit();
	}
	
	public static void captureScreenshot(String screenshotname) throws IOException
	{
		File fs =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs, new File("./TestResultScreenShot/"+screenshotname+".png"));
		System.out.println("screenshot taken");
		//getScreenshotAs(Output.FILE)
	}
	
	public static void rightClickOn(String optionToBeSelect)
	{
		Actions act= new Actions(driver);
	}
	
	public static int countForNonWorkingLink(List<WebElement> elemenltList) throws IOException
    {
           
           int count=0;
           
           for (int i=0;i<elemenltList.size();i++)
           {
                  WebElement el= elemenltList.get(i);
                  String url=el.getAttribute("href");
                
                  URL urlToBeCheck= new URL(url);
                  
                        HttpURLConnection connection= (HttpURLConnection)urlToBeCheck.openConnection();
           
                       // connection.setConnectTimeout(3000);
                        connection.connect();
                        connection.setRequestMethod("GET");
                        
                        
                        if(connection.getResponseCode()==200)
                        {
                        System.out.println("link working fine");
                        
                        }
                        else
                        {
                               count++;
                        }
           }
           System.out.println("Total number of non working link=="+count);
           return count;
    }
    

	//Function to return all dropdrown options
	public static List<String> getAllOptions(String locatorType,String locatorValue)
	{
		 List<String> optinonsList=null;
		
		 try{
				By locator;
				locator = locatorValue(locatorType, locatorValue);
				WebElement element = driver.findElement(locator);
				Select select= new Select(element);
			List<WebElement>alloptions=	select.getOptions();
		for(WebElement el:alloptions)
		{
			String temp =el.getText();
			optinonsList.add(temp);
		}
		 
		 }	
			catch(NoSuchElementException e)
			{
				System.out.println("There is no element available using locator"+locatorType+"and"+locatorValue);
			}
			return optinonsList;
	
	
	}
	
	public static boolean verifyDropDownListContent(String locatorType,String locatorValue, List<String> expectedList)
	{
		//boolean flag=false;
		
	
		List<String> actualList=getAllOptions(locatorType,locatorValue);
		
		 int exceptedSizeLength=expectedList.size();
		 int actualSizeLength=actualList.size();
		 
		if((exceptedSizeLength==0 && actualSizeLength==0)&&(exceptedSizeLength!=actualSizeLength))
		{
			return false;
		}
		
		else
		{
			Collections.sort(expectedList);
			
			Collections.sort(actualList);
			
			 return expectedList.equals(actualList);
			
		}
	
		
	}
	
	public static void captureScreenOnTestFailure(File screenshotName) throws IOException
	{
		/*System.out.println(System.getProperty("user.dir"));
			
	String ds=	System.getProperty("user.dir")+"\\TestResultScreenShot\\fail\\"+testName+".png";
	File destfile = new File(ds);
				*/
	File fs	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(fs, screenshotName);
	}

	
}


