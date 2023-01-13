package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		
		WebElement username= driver.findElement(By.id("email"));
		
		username.clear();
		
		username.sendKeys("Ramachandra");
		
		/*
		 * String text=username.getText();
		 * 
		 * System.out.println(text);
		 */
		
		String text= username.getAttribute("value");
		
		System.out.println(text);
		
		String text1=username.getAttribute("id");
		
		System.out.println(text1);
		
		String text2=username.getAttribute("placeholder");
		
		System.out.println(text2);
		

	}

}
