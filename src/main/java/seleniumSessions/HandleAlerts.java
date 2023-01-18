package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		
		/*
		 * driver.findElement(By.id("alertButton")).click();
		 * 
		 * Alert alt= driver.switchTo().alert();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * String text=alt.getText();
		 * 
		 * System.out.println(text);
		 * 
		 * alt.accept();
		 */
		  
			
		/*
		 * driver.findElement(By.id("confirmButton")).click();
		 * 
		 * Alert alt1= driver.switchTo().alert();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * alt1.dismiss();
		 */
			 
		 
		
			
			  WebElement popup=driver.findElement(By.id("promtButton"));
			  
			  JavascriptExecutor js=(JavascriptExecutor)driver;
			  
			  js.executeScript("arguments[0].click();", popup);
			  
			  Thread.sleep(2000);
			  
			  Alert alt2= driver.switchTo().alert();
			  
			  Thread.sleep(3000);
			  
			  alt2.sendKeys("ramureddy4555@gmail.com");
			  
			  alt2.accept();
			 
	}

}
