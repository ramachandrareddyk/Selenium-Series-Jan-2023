package seleniumSessions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptConcept {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavaScriptUtilities js= new JavaScriptUtilities(driver);
		
		String title=js.getTitleByJS();
		System.out.println(title);
		
		/*
		 * driver.navigate().to("https://demoqa.com/alerts");
		 * 
		 * WebElement button= driver.findElement(By.id("alertButton"));
		 * 
		 * js.clickElementByJS(button);
		 */
		
		driver.navigate().to("https://demoqa.com/text-box");
		
		js.sendkeysWithJS("userName", "TestUser");
		
		
		

	}

}
