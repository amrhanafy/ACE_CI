package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainDashBoard {
	
	
	@FindBy(className="aceTitleText")
	private WebElement ACE_Logo;
	
	@FindBy(id="ctl00_MasterPageContent_rptHomeMenu_ctl03_ctl00_ctl01_MenuLink")
	private WebElement Userslnk;
	
	@FindBy(id="ctl00_MasterPageContent_rptHomeMenu_ctl01_ctl00_ctl02_MenuLink")
	private WebElement CreateDeploylnk;
	
	@FindBy(id="ctl00_MasterPageContent_rptHomeMenu_ctl01_ctl00_ctl01_MenuLink")
	private WebElement Datasetslnk;
	
		public MainDashBoard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void ClickUserslnk()
	{
		Userslnk.click();
	}
	
	public boolean CheckHome()
	{
		return ACE_Logo.isDisplayed();
	}
	
	public void ClickDeployGroup()
	{
		CreateDeploylnk.click();
	}

	public void ClickDatasets()
	{
		Datasetslnk.click();
	}
}
