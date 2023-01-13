package seleniumSessions;

import java.awt.Window;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.makemytrip.com/");
		
		/*
		 * WebElement fromcity= driver.findElement(By.id("fromCity"));
		 * 
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * 
		 * js.executeScript("arguments[0].click", fromcity);
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement from=
		 * driver.findElement(By.xpath("//input[@placeholder='From']"));
		 * from.sendKeys("Bangaluru");
		 * 
		 * from.sendKeys(Keys.DOWN);
		 * 
		 * driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		 */
		
	    Actions act = new Actions(driver);
//	    act.keyDown(Keys.CONTROL).sendKeys("t").perform();
	    
	   // act.sendKeys(Keys.CONTROL,"t");
	    
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.open()");
	    
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
	    
	    //driver.get("https://www.facebook.com");
	    
	    driver.navigate().to("https://facebook.com");
	}
	
	

}
