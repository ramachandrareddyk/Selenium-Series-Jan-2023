package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedConcept {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		WebElement username = driver.findElement(By.id("email"));
		
		WebElement pass= driver.findElement(By.id("pass"));
		
		WebElement Login= driver.findElement(By.name("login"));
		
		WebElement forgetPassword= driver.findElement(By.linkText("Forgotten password?"));
		
		WebElement createAccount= driver.findElement(By.linkText("Create New Account"));
		
		if(username.isDisplayed()) {
			System.out.println("Element is display");
		} else {
			System.out.println("Element is not display");
		}
		
		if(pass.isDisplayed()) {
			System.out.println("Element is display");
		} else {
			System.out.println("Element is not display");
		}
		
		if(Login.isDisplayed()) {
			System.out.println("Element is display");
		} else {
			System.out.println("Element is not display");
		}
		
		
		if(forgetPassword.isDisplayed()) {
			System.out.println("Element is display");
		} else {
			System.out.println("Element is not display");
		}
		
		if(createAccount.isDisplayed()) {
			System.out.println("Element is display");
		} else {
			System.out.println("Element is not display");
		}

	}

}
