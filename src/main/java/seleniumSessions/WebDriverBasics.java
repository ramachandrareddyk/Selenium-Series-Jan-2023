package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	//Selenium IDE
	//Selenium RC
	//Selenium WebDriver
	//Selenium Grid

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\eclipse-workspace\\SeleniumSeries_Jan_2023\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		String title= driver.getTitle();
		
		System.out.println(title);
		
		if(title.equalsIgnoreCase("Facebook – log in or sign up")) {
			System.out.println("Launched Home page");
		} else {
			System.out.println("Application not launched");
		}
		
		String currentURL = driver.getCurrentUrl();
		
		System.out.println(currentURL);
		
		String sourcrce=driver.getPageSource();
		
		System.out.println(sourcrce);
		
		
		//driver.close();
		
		driver.quit();
		
		
		
		
	
		
		

	}

}
