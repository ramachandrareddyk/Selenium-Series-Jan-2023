package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverActions {

public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		WebElement Fashans= driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		
		Actions act= new Actions(driver);
		
		act.moveToElement(Fashans).perform();
		
		
		

	}

}
