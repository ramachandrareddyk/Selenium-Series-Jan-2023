package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMutipleWindowa {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String>windows=  driver.getWindowHandles();
		
	Iterator<String>it=windows.iterator();
	
	String parentWindowId=it.next();
	
	System.out.println(parentWindowId);
	
	String childwindowid=it.next();
	
	System.out.println(childwindowid);
	
	driver.switchTo().window(childwindowid);
	
	System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	
	driver.close();
	
	//driver.quit();
	
	driver.switchTo().window(parentWindowId);
	
	System.out.println(driver.getTitle());

	}

}
