package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBoostrapDropdown {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		List<WebElement> options=driver.findElements(By.xpath("//*[@id=\"main\"]/div[3]/ul/li/a"));
		
		WebElement dropdown= driver.findElement(By.id("menu1"));
		
		//driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/ul/li[2]/a")).click();
		
		handleHoostrapDropdown(dropdown,options,"CSS");

	}
	
	public static void handleHoostrapDropdown(WebElement element, List<WebElement>elements, String value) throws InterruptedException {
		element.click();
		
		Thread.sleep(2);
		for (int i = 0; i < elements.size(); i++) {
			String text= elements.get(i).getText();
			if(text.equals(value)) {
				elements.get(i).click();
			}
		}
		
	}

}
