package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	WebDriver driver;
	
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	@FindBy (css ="#ctl00_ctl00_MasterPageContent_cpv_lbCreate")
	private WebElement CreateUserbtn;
		
	public void ClickCreateUser()
	{
	 CreateUserbtn.click();
	}

}
