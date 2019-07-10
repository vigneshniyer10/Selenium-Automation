package Tests;

import Config.UIActionKeywords;
import Utility.ExcelUtils;

public class DriverExecutor
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String sPath="C:\\Users\\Admin\\Desktop\\Selenium Training\\KeywordDrivenData.xlsx";
		ExcelUtils.setExclFile(sPath, "Testdata");
	
	for(int iRows=1;iRows<=7;iRows++)
	{
		String sActionKeyword=ExcelUtils.getCellData(iRows, 3);
		if(sActionKeyword.equals("OpnBrowser"))
		{
			UIActionKeywords.OpnBrowser();
		}
		else if(sActionKeyword.equals("Navigate"))
				{
			UIActionKeywords.Navigate();	
				}
		else if(sActionKeyword.equals("enterEmail"))
		{
	UIActionKeywords.enterEmail();
		}
		else if(sActionKeyword.equals("enterPassword"))
		{
	UIActionKeywords.enterPassword();
		}
		else if(sActionKeyword.equals("clickLogin"))
		{
	UIActionKeywords.clickLogin();
		}	
		else if(sActionKeyword.equals("applyWait"))
		{
	UIActionKeywords.applyWait();
		}
		else if(sActionKeyword.equals("CloseBrowse"))
		{
	UIActionKeywords.CloseBrowser();
		}
	}
}
}