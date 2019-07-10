package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class JSExec {
	static WebDriver driver;

public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	/*WebElement ele=driver.findElement(By.xpath("//Span[contains(text(),'Hello, Sign in')]"));
	Actions action = new Actions(driver);
	Action act=action.moveToElement(ele).build();
	act.perform();
	WebElement	Signup= driver.findElement(By.xpath("//span[text()='Sign in']"));
	//Signup.click();
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("arguement[0].click();", Signup);*/
	
	WebElement insta=driver.findElement(By.linkText("Instagram"));
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguement[0].scrollIntoView(true);", insta);
	insta.click();
	
	
	
	
	
	
}
}
