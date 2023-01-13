package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown1 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	
	WebDriverManager.chromedriver().setup();

	driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.linkText("Create New Account")).click();
	
	Thread.sleep(3000);
	
	WebElement day=driver.findElement(By.id("day"));
	
	WebElement Month= driver.findElement(By.id("month"));
	
	WebElement Year= driver.findElement(By.id("year"));
	
	HandleDropDown.selectDropdownValueByVisableText(day, "20");
	
	HandleDropDown.selectDropdownValueByVisableText(Month, "Feb");
	
	HandleDropDown.selectDropdownValueByVisableText(Year, "2000");
	
	
	}

}
