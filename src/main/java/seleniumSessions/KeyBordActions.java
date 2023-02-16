package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBordActions {

public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement fullName= driver.findElement(By.id("userName"));
		
		WebElement email= driver.findElement(By.id("userEmail"));
		
		fullName.sendKeys("Ramachandra");
		
		fullName.sendKeys(Keys.CONTROL,"a");
		
		fullName.sendKeys(Keys.CONTROL,"c");
		
		fullName.sendKeys(Keys.TAB);
		
		email.sendKeys(Keys.CONTROL,"v");

	}

}
