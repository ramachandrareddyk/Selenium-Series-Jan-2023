package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement DoubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		/*
		 * Actions act= new Actions(driver);
		 * 
		 * act.doubleClick(DoubleClickButton).perform();
		 */
		doDoubleClick(DoubleClickButton);
		
		Thread.sleep(3000);
		
		//driver.switchTo().alert().accept();
		doAlertAccept();
		

	}
	
	public static void doDoubleClick(WebElement element) {
		Actions act= new Actions(driver);
		
		act.doubleClick(element).perform();
		
	}
	
	
	public static void doAlertAccept() {
		driver.switchTo().alert().accept();
	}

}
