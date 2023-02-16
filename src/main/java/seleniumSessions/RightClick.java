package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement RightClick= driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		Actions act= new Actions(driver);
		
		act.contextClick(RightClick).perform();
		
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();

	}
	
	public static void doRghtClick(WebElement element) {
		Actions act= new Actions(driver);
		
		act.contextClick(element).perform();
	}

}
