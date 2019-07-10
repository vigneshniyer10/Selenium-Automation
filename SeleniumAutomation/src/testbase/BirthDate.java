package testbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BirthDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.navigate().to("https://www.facebook.com");
		WebElement m=d.findElement(By.name("birthday_day"));
		Select date= new Select(m);
		date.selectByVisibleText("10");
		WebElement m1=d.findElement(By.name("birthday_month"));
		Select month= new Select(m1);
		month.selectByIndex(4);
		WebElement m2=d.findElement(By.name("birthday_year"));
		Select year= new Select(m2);
		year.selectByValue("1991");
		WebElement m3= d.findElement(By.xpath("//input[@value='2']"));
		m3.click();
		d.findElement(By.xpath("//input[@id='u_0_9']")).click();
		//*[@id="u_0_9"]
		d.findElement(By.xpath("//button[@name,'websubmit']")).click();
		
	}

}
