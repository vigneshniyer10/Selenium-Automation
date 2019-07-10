package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/iframe.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.switchTo().frame("iframe_b");
		driver.findElement(By.name("a")).sendKeys("Vignesh");
		driver.switchTo().defaultContent();
		driver.findElement(By.name("a")).sendKeys("Narayan");
	
	}

}



