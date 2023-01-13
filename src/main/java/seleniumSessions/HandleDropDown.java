package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

		// there is a 2 types of dropdowns
		// 1. Select tag dropdown
		// 2. Boostrap dropdown

		WebElement Country = driver.findElement(By.id("Form_getForm_Country"));

		/*
		 * Select sl = new Select(Country);
		 * 
		 * //sl.selectByVisibleText("India");
		 * 
		 * //sl.selectByValue("India");
		 * 
		 * sl.selectByIndex(1);
		 */

		selectDropdownValueByVisableText(Country, "India");

	}

	public static void selectDropdownValueByVisableText(WebElement element, String value) {

		Select select = new Select(element);

		select.selectByVisibleText(value);
	}

	public static void selectDropdownByValue(WebElement element, String value) {

		Select select = new Select(element);

		select.selectByValue(value);
	}

	public static void selectDropdownByIndex(WebElement element, int index) {

		Select select = new Select(element);

		select.selectByIndex(index);
	}
	
	public void test() {
		
	}

}
