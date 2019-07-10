package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.LoginPage;

public class TC_login1 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		LoginPage login =PageFactory.initElements(driver, LoginPage.class);
		login.txtbx_UserName.sendKeys("Test123");
		login.txtbx_Password.sendKeys("test");
		login.btn_Login.click();
		System.out.println("Login successful");
		driver.quit();
	}

}
