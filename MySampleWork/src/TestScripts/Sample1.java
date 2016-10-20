package TestScripts;

import java.util.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
 
public class Sample1 {
	/*@Test
	
	public void login(){
		System.out.println("Hello");
	}

	@Test
	public void changePwd()
	{
		System.out.println("change pwd");
		
	}
	@Test
	public void logout(){
		System.out.println("logout from applin");
	}*/

	
	public static void main(String[] arg) throws InterruptedException{
		//ArrayList
	/*	WebDriver driver =new FirefoxDriver();
		*/
		/*WebDriver driver =new InternetExplorerDriver();
		System.setProperty("webdriver.ie.driver", "//Driver//IEDriverServer.exe");
		*/
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\sharvari.bhosale\\Sample workspace\\MySampleWork\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
				Alert alert = driver.switchTo().alert();
				
			}
		} catch (TimeoutException e) {

		}	
		driver.findElement(By.cssSelector("css=div.modalCloseSmall")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtOnwardCalendar")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='rbcal_txtOnwardCalendar']/table/tbody/tr[3]/td[7]")).click();
		
		
		
		
		int sam_array[]=new int[5];
		ArrayList<Integer> mylist=new ArrayList<Integer>(5);
			mylist.add(0,9);
			mylist.add(1,8);
			mylist.add(2,12);
			mylist.add(3,98);
			mylist.add(4,57);
		
			
			for(Integer x: mylist)
				System.out.println(x);
			
			System.out.println("mylist size " + mylist.size());
			ArrayList mylist2=(ArrayList)mylist.clone();
			
			
			System.out.println("mylist2  " + mylist2);
			
			mylist.remove(3);
			for(Integer x: mylist)
				System.out.println(x);
			System.out.println("size " + mylist.size());
			
			
			//ListIterator
			
			ArrayList<String> names=new ArrayList<String>();
			names.add("Mike");
			names.add("John");
			names.add("Sandy");
			names.add("Sharvs");
			ListIterator<String> itr=names.listIterator();
			
			while(itr.hasNext())
				System.out.println(itr.next());
				
			HashSet<String> name=new HashSet<String>();
			name.add("A");
			name.add("B");
			name.add("C");
			Iterator<String> itr1=name.iterator();
			while(itr1.hasNext())
				System.out.println(itr1.next());
			
			
	}
}

