package testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestBase 
{ 
public static WebDriver driver;
public static Properties prop;
public static FileInputStream ip;
   public TestBase() throws IOException 
   { 
prop = new Properties();
ip = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\MavenAutomation\\src\\main\\java\\config\\config.properties");
prop.load(ip);
} 
public static void initialization() 
{
String browserName = prop.getProperty("browser"); 
if(browserName.equals("chrome")){
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\MavenAutomation\\Drivers\\chromedriver.exe"); 
driver = new ChromeDriver(); }
else if(browserName.equals("firefox"))
{System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenAutomation\\Drivers\\geckodriver.exe"); 
driver = new FirefoxDriver();  } 
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get(prop.getProperty("url")); 
}}