package Config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIActionKeywords 
{
public static WebDriver driver; 

public static void OpnBrowser()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
	driver= new ChromeDriver();
}
public static void Navigate()
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
}
public static void enterEmail()
{
	driver.findElement(By.id("email")).sendKeys("Vignesh");
}
public static void enterPassword()
{
	driver.findElement(By.id("pass")).sendKeys("Pass@123");
}
public static void clickLogin()
{
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
}
public static void applyWait() throws InterruptedException
{
	Thread.sleep(1000);
}
public static void CloseBrowser()
{
	driver.quit();
}
}
