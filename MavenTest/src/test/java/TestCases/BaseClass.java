package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;

	@BeforeMethod
	public void OpenBrowse() 
	{
		// String ExePath= "E:\\IDB\\Integrant\\SELF_Development\\Automation
		// Java\\chromedriver.exe";
		// String ExePath= "E:\\IDB\\Integrant\\SELF_Development\\Automation
		// Java\\path\\geckodriver.exe";
		// System.setProperty("webdriver.gecko.driver", ExePath);
		// driver= new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String ACE_Url = "http://192.168.254.138/agw";
		driver.get(ACE_Url);
	}

	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}
}
