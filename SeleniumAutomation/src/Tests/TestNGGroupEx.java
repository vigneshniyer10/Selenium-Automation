package Tests;

import org.testng.annotations.Test;

public class TestNGGroupEx {

	@Test(groups= {"Now"})
	void TC_01()
	{
		System.out.println("First Test");
	}
	@Test(groups= {"then"})
	void TC_02()
	{
		System.out.println("Sec Test");
	}
	@Test(groups= {"Now"})
	void TC_03()
	{
		System.out.println("Third Test");
	}
	@Test(groups= {"then"})
	void TC_04()
	{
		System.out.println("Fourth Test");
	}
	@Test(groups= {"Now"})
	void TC_05()
	{
		System.out.println("Firth Test");
	}
	}
