package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement drag= driver.findElement(By.id("draggable"));
		
		WebElement drop= driver.findElement(By.id("droppable"));
		
		Actions act= new Actions(driver);
		
		//act.dragAndDrop(drag, drop).perform();
		
		//act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		performDragAndDrop(drag, drop);
		

	}
	
	public static void performDragAndDrop(WebElement element, WebElement element1) {
		Actions act= new Actions(driver);
		
		
		act.dragAndDrop(element, element1).perform();
		
	}

}
