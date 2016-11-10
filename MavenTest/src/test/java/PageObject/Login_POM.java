package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM {
	
	//Initialize my objects in the page
	public Login_POM(WebDriver driver ){
		
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id= "loginIas_UserName")
	public WebElement UserNametxt;
	
	@FindBy(id = "loginIas_Password")
	private WebElement Passwordtxt;
	
	@FindBy(id= "loginIas_LoginButton")
	private WebElement SignInbtn;
	
	@FindBy(id="loginIas_FailureText")
	public WebElement InvalidUser;

	public void EnterLoginValues (String UserName , String Password)
	
	{
		//Set The username value
		UserNametxt.sendKeys(UserName);
		
		//Set The password value
		Passwordtxt.sendKeys(Password);
		
	}
	
	public void ClickLogin ()
	{
		SignInbtn.click();
	}

}
