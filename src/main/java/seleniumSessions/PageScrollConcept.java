package seleniumSessions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageScrollConcept {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		Thread.sleep(2000);
		
		JavaScriptUtilities js= new JavaScriptUtilities(driver);
		
		js.pageDown();
		
		
		Thread.sleep(2000);
		
		js.pageScrollUp();
		//js.pageDown("2000");
		
		
		
		//WebElement furniture= driver.findElement(By.xpath("//div[text()='See personalized recommendations']"));
		
		//js.scrollInToView(furniture);

	}

}
