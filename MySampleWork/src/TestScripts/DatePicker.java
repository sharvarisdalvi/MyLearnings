package TestScripts;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Strings;

import java.util.*;
public class DatePicker {

/*@BeforeTest
	public static void main (Strings[] arg) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\sharvari.bhosale\\Sample workspace\\MySampleWork\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(200);
	driver.get("www.expedia.co.in");
	Thread.sleep(200);
	driver.findElement(By.xpath("//a[@id='tab-flight-tab']")).click();
	driver.findElement(By.cssSelector("css=input#flight-origin")).sendKeys("Pune, India (PNQ-Lohegaon)");
	Actions act= new Actions(driver);
	act.keyDown(Keys.TAB);
	driver.findElement(By.cssSelector("css=input#flight-destination")).sendKeys("Male, Maldives (MLE-Male Intl.");
	act.keyDown(Keys.TAB);	

	driver.manage().window().maximize();
}*/
	
/*	@Test*/
	/*public static String dayBefore() {
	public static void main(String[]arg)
		//find 3 days before date
		String threeDaysBefore = "";
	    Calendar cal = Calendar.getInstance();
	    
	    System.out.println("Current Date: "+(cal.get(Calendar.MONTH)+1)+"-"
	    +cal.get(Calendar.DATE)+"-"
		+cal.get(Calendar.YEAR));
	    System.out.println("Current time : " + cal.get(Calendar.HOUR_OF_DAY)
                + ":"
                + cal.get(Calendar.MINUTE)
                + ":"
                + cal.get(Calendar.SECOND));
	  	cal.add(Calendar.DATE, -3);
	  	cal.add(Calendar.HOUR,10);
	  	
		
	    System.out.println("Date before threee days: " + (cal.get(Calendar.MONTH)+1)+"-"
	    	    +cal.get(Calendar.DATE)+"-"
				  +cal.get(Calendar.YEAR));
	    System.out.println("Time before 10 hours : " + cal.get(Calendar.HOUR_OF_DAY)
                + ":"
                + cal.get(Calendar.MINUTE)
                + ":"
                + cal.get(Calendar.SECOND));
		return threeDaysBefore;
	}*/
	
	public static void main(String[] args) {
		
	
	String dayafter="";
	 Calendar cal2 = Calendar.getInstance();
	 System.out.println("Current Date: "+(cal2.get(Calendar.MONTH)+1)+"-"
			    +cal2.get(Calendar.DATE)+"-"
				+cal2.get(Calendar.YEAR));
			    System.out.println("Current time : " + cal2.get(Calendar.HOUR_OF_DAY)
		                + ":"
		                + cal2.get(Calendar.MINUTE)
		                + ":"
		                + cal2.get(Calendar.SECOND));
			    cal2.add(Calendar.MONTH, 0);
			    cal2.add(Calendar.YEAR, 2);
			    
			    System.out.println("Date After two  years: " + (cal2.get(Calendar.MONTH)+1)+"-"
			    	    +cal2.get(Calendar.DATE)+"-"
						  +cal2.get(Calendar.YEAR));
			    System.out.println("Time before 10 hours : " + cal2.get(Calendar.HOUR_OF_DAY)
		                + ":"
		                + cal2.get(Calendar.MINUTE)
		                + ":"
		                + cal2.get(Calendar.SECOND));   
			    
	 
	

		
	}
}
