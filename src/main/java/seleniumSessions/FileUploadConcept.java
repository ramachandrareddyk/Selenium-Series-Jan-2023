package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadConcept {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement fileUpload= driver.findElement(By.name("upfile"));
		
		fileUpload.sendKeys("C:\\Users\\Gopi\\Desktop\\New Test Data.xlsx");
		
	}
	
	public static void fileUpload(WebElement element,String Path) {
		element.sendKeys(Path);
	}

}
