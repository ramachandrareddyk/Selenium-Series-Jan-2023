package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatersInSelenium {

	public static WebDriver driver;
	public static void main(String[] args) {
		//1. ID--1
		//2. Name--2
		//3. Class name
		//4. CSS Selector (Caskading style sheet selector)
		//5. Xpath--3
		//6. Link Text
		//7. Partial Link text
		//8. Tag name

		
		WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		//id
		//1
		/*
		 * WebElement username= driver.findElement(By.id("email"));
		 * 
		 * WebElement password= driver.findElement(By.id("pass"));
		 * 
		 * //username.sendKeys("8106660316");
		 * 
		 * driver.findElement(By.id("email")).sendKeys("8106660316");
		 * 
		 * driver.findElement(By.id("pass")).sendKeys("Test@123");
		 */
		
		//using By Locaters
		
	/*	By username=By.id("email");
		By Password= By.id("pass");*/
		
		//driver.findElement(username).sendKeys("8106660316");
		/*
		 * WebElement password= driver.findElement(Password);
		 * 
		 * password.sendKeys("Test@123");
		 */
		/*getWebElement(username).sendKeys("Ramachandra");
		
		WebElement password= getWebElement(Password);
		password.sendKeys("Test@123");*/
		
		
		//name
		
		/*
		 * driver.findElement(By.name("email")).sendKeys("Testing User");
		 * 
		 * WebElement password= driver.findElement(By.name("pass"));
		 * 
		 * password.sendKeys("Test@123");
		 */
		
		/*
		 * By Password= By.name("pass");
		 * 
		 * getWebElement(Password).sendKeys("TestManager");
		 */
		
		
		//Class name
		
		/*
		 * driver.findElement(By.className("inputtext")).sendKeys("TestUser");
		 * 
		 * driver.findElement(By.className("inputtext")).sendKeys("TestManager");
		 */
		
		/*
		 * By usernameBy= By.className("inputtext");
		 * 
		 * driver.findElement(usernameBy).sendKeys("TestManagement");
		 */
		
		
		//CSS Selector
		
		/*
		 * driver.findElement(By.cssSelector("#email")).sendKeys("CSS User");
		 * driver.findElement(By.cssSelector("#pass")).sendKeys("TestUser");
		 */
		
		//Xpath
		
		/*
		 * driver.findElement(By.xpath("//*[@id='email']")).sendKeys("TestUser");
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Test@123545");
		 */
		
		
		//LinkText
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.findElement(By.linkText("Create New Account")).click();
		
		//partial Link text
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//driver.findElement(By.partialLinkText("Create New")).click();
		
		
	//tag name
		
		WebElement header= driver.findElement(By.tagName("h2"));
		
		
	}
	
	public static WebElement getWebElement(By Locater) {
		WebElement element= driver.findElement(Locater);
		
		return element;
	}

}
