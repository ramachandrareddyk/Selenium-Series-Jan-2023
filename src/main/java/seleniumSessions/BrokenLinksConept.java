package seleniumSessions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksConept {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) {
			String link=links.get(i).getAttribute("href");
			verifyLink(link);
		}
	}
	
	public static void verifyLink(String urlLink) {
		try {
			 
			URL link= new URL(urlLink);
			
			HttpURLConnection http=(HttpURLConnection)link.openConnection();
			
			http.setConnectTimeout(2000);
			
			http.connect();
			
			if(http.getResponseCode()==200) {
				System.out.println(urlLink+"  "+http.getResponseMessage());//ok
			}
			
			if(http.getResponseCode()==400) {
				System.out.println(urlLink+"  "+http.getResponseMessage());//null
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
