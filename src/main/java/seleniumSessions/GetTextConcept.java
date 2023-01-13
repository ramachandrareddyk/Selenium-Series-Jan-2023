package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextConcept {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		
		WebElement PageHeader= driver.findElement(By.tagName("h2"));
		
		String text= PageHeader.getText();
		
		System.out.println(text);
		
		WebElement forgetPassword=driver.findElement(By.linkText("Forgotten password?"));
		
		String text1=forgetPassword.getText();
		
		System.out.println(text1);

	}

}
