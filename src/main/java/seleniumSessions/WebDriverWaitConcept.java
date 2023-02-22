package seleniumSessions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wait =new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		WebElement button=driver.findElement(By.id("timerAlertButton"));
		
		wait.until(ExpectedConditions.elementToBeClickable(button));
		
		waitUntilElementToBeClickable(button, 10);
		
		
		
	}
	
	public static void waitUntilElementToBeClickable(WebElement element, int seconds) {
		WebDriverWait wait =new WebDriverWait(driver, seconds);
		
		//wait.until(ExpectedConditions.);
	}

}
