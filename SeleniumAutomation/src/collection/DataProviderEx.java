package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	@DataProvider(name="Authentication")
	Object[][] credential()
	{
		Object a[][]=new Object[2][2];
		a[0][0]="Vignesh";
		a[0][1]="Vign@123";
		a[1][0]="Iyer";
		a[1][1]="Iyer@123";
		return a;
	}
	@Test(dataProvider="Authentication")
	void login(String Username, String Password)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		WebElement username=d.findElement(By.id("email"));
		WebElement password=d.findElement(By.id("pass"));
		username.sendKeys(Username);
		password.sendKeys(Password);
		d.findElement(By.xpath("//input[@value='Log In']")).click();
	}

	}
