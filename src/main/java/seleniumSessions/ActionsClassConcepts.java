package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcepts {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement username= driver.findElement(By.id("email"));
		
		WebElement Password= driver.findElement(By.id("pass"));
		
		WebElement loginButton= driver.findElement(By.name("login"));
		
		//username.sendKeys("");
		//loginButton.click();
		
		Actions act= new Actions(driver);
		
		act.sendKeys(username, "Test User").perform();
		
		act.sendKeys(Password, "Test@123").perform();
		
		act.click(loginButton).perform();
		
		
		
		

	}

}
