package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//FindElement will return only one webelement
		
		//if there is no element with given locater it will give the exception "NoSuchElementException"
		
		WebElement username= driver.findElement(By.id("email"));
		
		//FindElements will return list of WebElements
		
		//if there is no element with given locater it will not give any exception it will return empty list
		List<WebElement>links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
		String linktext	=links.get(i).getText();
		System.out.println(linktext);
		}

	}

}
