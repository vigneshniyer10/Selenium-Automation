package testbase;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringEx {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/iframe.html");
		driver.manage().window().maximize();
		
		//WebElement ele=driver.findElement(By.xpath("//button[contains(text(),'Festival')]"));
		//WebElement ele1=driver.findElement(By.xpath("//a[text()='Pongal']"));
		//WebElement ele2=driver.findElement(By.id("dblClkButton_01"));
		WebElement ele3=driver.findElement(By.id("uname_01"));
		
		//Actions builder=new Actions(driver);
		//Action act2=builder.doubleClick(ele2).build();
		//Action act1=builder.moveToElement(ele).moveToElement(ele1).click().build();
		//act2.perform();
		//Alert alt=driver.switchTo().alert();
		//System.out.println(alt.getText());
		//alt.accept();
		driver.findElement(By.xpath("//input[@name='a']"));
		Actions builder=new Actions(driver);
		Action act3=builder.click(ele3).keyDown(ele3, Keys.SHIFT).sendKeys("Vignesh").contextClick().build();
		act3.perform();
		
				
	}

}
