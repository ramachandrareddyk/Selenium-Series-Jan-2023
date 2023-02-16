package seleniumSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		WebElement frame1= driver.findElement(By.name("content"));
		//Switching in to frame using WebElement
		driver.switchTo().frame(frame1);
		
		String text=driver.findElement(By.tagName("h1")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		//Switching in to frame using frame name
		//driver.switchTo().frame("main");
		
		switchToFrameUsingFrameName("main");
		
		WebElement mainFrame= driver.findElement(By.xpath("//h2[text()='Title bar ']"));
		String text1=mainFrame.getText();
		
		System.out.println(text1);
		
		SwitchToDefaultContent();

	}
	
	public static void switchToFrameUsingWebElement(WebElement Element) {
		driver.switchTo().frame(Element);
	}

	public static void switchToFrameUsingFrameName(String Name) {
		driver.switchTo().frame(Name);
	}
	
	
	public static void switchToFrameUsingIndex(int number) {
		driver.switchTo().frame(number);
	}
	public static void SwitchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	
}
