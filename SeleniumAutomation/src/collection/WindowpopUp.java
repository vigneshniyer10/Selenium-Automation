package collection;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowpopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.hdfcbank.com");
	
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
		d.findElement(By.xpath("//a[@class='homeloginbtn']")).click();
		String parent=d.getWindowHandle();	//storing session id
		Set<String> child=d.getWindowHandles();	//storing all opened windows session ids
		//Set Stores all unique windows
		for(String w: child)
		{
			d.switchTo().window(w);
		}
		System.out.println(d.getTitle());
		Thread.sleep(5000);
		d.close();
		d.switchTo().window(parent);
		System.out.println(d.getTitle());
		}
	

}
