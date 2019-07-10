package Tests;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testCase {
@BeforeTest
public void startbrowser()
{
System.out.println("Starting Browser");	
}
@Test(priority=0)
public void LogIntoFB()
{
	System.out.println("Login to FB");
}
@Test(priority=2)
public void logout()
{
	System.out.println("Logout of FB");
}
@Test(priority=1)
public void AddtoCart()
{
	System.out.println("Add to Cart");
}
@AfterTest
public void closeBrowser()
{
	System.out.println("Closing the broswer");
}


}
