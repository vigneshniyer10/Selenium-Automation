package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
				WebDriver d= new ChromeDriver();
				d.navigate().to("https://www.google.com");
				d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
				WebElement search= d.findElement(By.name("q"));
				search.sendKeys("Selenium");
				search.sendKeys(Keys.ENTER);
				
				d.navigate().back();
				//d.navigate().refresh();
				WebDriverWait wait=new WebDriverWait(d,10);
				WebElement search1=wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
				search1.sendKeys("Webdriver");
				search1.sendKeys(Keys.ENTER);
				
				
		
	
	}

}
