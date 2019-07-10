package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home {
	@FindBy(how=How.ID,using="userNavigationLabel")
	public WebElement Account_Navigation;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"js_eo\"]/div/div/ul/li[8]/a/span/span")
	public WebElement LogOut;
	
}
