package seleniumSessions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalender {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		
		selectFeatureDate("February 2024", "29");
		
	}
	
	public static void selectFeatureDate(String ExpMonthYear, String Day) {
		if(Integer.parseInt(Day)<=0) {
			System.out.println("Wrong date passed "+Day);
			
			return;
		}
		
		
		if(Integer.parseInt(Day)>31) {
			System.out.println("Wrong date passed "+Day);
			
			return;
		}
		if(ExpMonthYear.contains("February") && Integer.parseInt(Day)>28) {
			System.out.println("Wrong date passed "+Day);
			
			return;
		}
		String actMonthYear= driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(actMonthYear);
		
		while(!actMonthYear.equalsIgnoreCase(ExpMonthYear)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			actMonthYear= driver.findElement(By.className("ui-datepicker-title")).getText();
			
			System.out.println(actMonthYear);
		}
		selectDate(Day);
	}
	
	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}

}
