package seleniumSessions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageloadTimeOut {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
	//	Thread.sleep(2000);
		
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		pageloadTimeOut(25);
		
		driver.navigate().to("https://www.myntra.com");
		
		pageloadTimeOut(50);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
	}
	
	public static void pageloadTimeOut(int seconds) {
		driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
	}

}
