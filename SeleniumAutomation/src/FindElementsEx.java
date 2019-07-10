import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEx {

	public static void VerifyBrokernLink(String urlLink)throws IOException
	{
		URL link=new URL(urlLink);
		HttpURLConnection conn=(HttpURLConnection)link.openConnection();
		conn.connect();
		
		if(conn.getResponseCode()==200)
		{
			System.out.println(urlLink+"-" + conn.getResponseMessage());
		}
		if(conn.getResponseCode()==404)
		{
			System.out.println(urlLink+"-" + conn.getResponseMessage());
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.navigate().to("https://www.facebook.com");
		List<WebElement> elements=d.findElements(By.tagName("a"));
		for(WebElement a:elements)
		{
			//System.out.println(a.getText());
			//System.out.println(a.getAttribute("href"));	//Fetech the URL
		String url=	a.getAttribute("href");
		VerifyBrokernLink(url);
		
			
		}
	}

}
