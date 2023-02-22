package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtilities {
	
	public WebDriver driver;
	
	public JavaScriptUtilities(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getTitleByJS() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		return js.executeScript("return document.title;").toString();
		
	}
	
	public void clickElementByJS(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();",element);
	}
	
	public void sendkeysWithJS(String id, String value) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('"+id+"').value='"+value+"'");
	}
	
	public void pageDown() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	public void pageDown(String height) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,'"+height+"')");
	}
	
	
	public void scrollInToView(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public void pageScrollUp() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeAsyncScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	

}
