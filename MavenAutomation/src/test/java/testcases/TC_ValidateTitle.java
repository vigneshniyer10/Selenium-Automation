package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import helper.ScreenshotCapture;
import testbase.TestBase;

public class TC_ValidateTitle {

	@Test
	void ValidateTitle() throws Exception {
		TestBase t=new TestBase();
		TestBase.initialization();
		String actual=TestBase.driver.getTitle();
		System.out.println(actual);
		String expected="Facebook – log in or sign up";
		
		Assert.assertEquals(actual,expected);
		ScreenshotCapture.getScreenshot(TestBase.driver, "Title");
		
		TestBase.driver.close();

	}

}
