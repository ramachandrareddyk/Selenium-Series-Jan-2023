package seleniumSessions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplycitlyWait {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement login= driver.findElement(By.name(""));
		
		WebElement username= driver.findElement(By.name(""));
		
		WebElement password= driver.findElement(By.name(""));
		
		WebElement submitBtn= driver.findElement(By.name(""));
		
		WebElement UserProfile= driver.findElement(By.name(""));
		
		WebElement cart= driver.findElement(By.name(""));

	}

}
