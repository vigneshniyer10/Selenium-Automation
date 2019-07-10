package testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.ScreenshotCapture;
import pages.LoginPage;
import testbase.TestBase;


public class Logout {
@Test
void Logout() throws IOException
{
	TestBase t=new TestBase();
	TestBase.initialization();
	LoginPage l=PageFactory.initElements(TestBase.driver, LoginPage.class);
	l.txtbx_UserName.sendKeys("Test123");
	l.txtbx_Password.sendKeys("test");
	l.btn_Login.click();
	
}
}
