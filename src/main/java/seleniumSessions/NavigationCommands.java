package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.in");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		
		

	}

}
