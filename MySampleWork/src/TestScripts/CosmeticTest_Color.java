package TestScripts;

import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.ajax.JSON;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class CosmeticTest_Color {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\sharvari.bhosale\\Sample workspace\\MySampleWork\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		WebElement next=driver.findElement(By.id("next"));
		String bgColor=next.getCssValue("color");
		System.out.println(bgColor);
		Color color=Color.fromString(bgColor);
		String bgColorCode=color.asHex();
		System.out.println(bgColorCode);
		
		String fontSize=next.getCssValue("font-size");
		System.out.println(fontSize);
		driver.quit();
		
		
	}

}
