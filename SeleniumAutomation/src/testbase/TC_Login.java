package testbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		/*WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));*/
	/*	username.sendKeys("rahul");
		password.sendKeys("12345");*/
		driver.findElement(By.xpath("//input[@name='email']"));
		driver.findElement(By.xpath("//input[@name='pass']"));
		/*driver.findElement(By.xpath("//input[@value='Log In']")).click();*/
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
	}

}
