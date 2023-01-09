package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gopi\\eclipse-workspace\\SeleniumSeries_Jan_2023\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		
		String title= driver.getTitle();
		
		System.out.println(title);
		
		//driver.close(); 
		
		//only the browser will get close
		//session id will not close
		
		//driver.getTitle();NoSuchSessionException: invalid session id
		
		driver.quit();
		//it will close browse as well as session id
		
		driver.getTitle();//NoSuchSessionException: Session ID is null
		
	}

}
