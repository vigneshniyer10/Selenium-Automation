package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x;
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		x=driver.getTitle();
		System.out.println(x);
		driver.close();

	}

}
