package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorEx {
	
	public static void ClickElementByJS(WebElement element, WebDriver driver) {
		
		JavaScriptExecutorEx js= (JavaScriptExecutorEx)driver;
		js.executeScript("arguements[0].click();",element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

	}

}
