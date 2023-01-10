package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAndNavigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//Wait untill complete page will load then it'll goto next action/step
		  driver.get("https://www.facebook.com");
		  
		  System.out.println(driver.getTitle());
		  
		  
		  Thread.sleep(2000);
		 
		  //it will not wait until complete page will load immediatly go to next action/step
		  driver.navigate().to("https://www.facebook.com");
		 
		  System.out.println(driver.getTitle());
	}

}
