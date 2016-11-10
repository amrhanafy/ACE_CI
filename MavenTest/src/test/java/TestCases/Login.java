package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Libs.Excel_DDT;
import PageObject.Login_POM;
import PageObject.MainDashBoard;

public class Login extends BaseClass {

	@Test(priority = 1)

	public void Login_Test_valid() {
		Excel_DDT inputs;
		inputs = new Excel_DDT("E:\\IDB\\Integrant\\SELF_Development\\Automation Java\\Inputs.xls");
		Login_POM Login = new Login_POM(driver);
		MainDashBoard MainDB = new MainDashBoard(driver);
		Login.EnterLoginValues(inputs.getcellvalue(inputs.Getcell("UserName"), 1),
				inputs.getcellvalue(inputs.Getcell("Password"), 1));
		Login.ClickLogin();
		Assert.assertTrue(MainDB.CheckHome());
		System.out.println("Test case is passed with username_pass" + inputs.getcellvalue(inputs.Getcell("UserName"), 1));
	}

	@Test(priority = 0)
	public void Login_Test_Invalid() {
		Excel_DDT inputs;
		inputs = new Excel_DDT("E:\\IDB\\Integrant\\SELF_Development\\Automation Java\\Inputs.xls");
		Login_POM Login = new Login_POM(driver);
		Login.EnterLoginValues(inputs.getcellvalue(inputs.Getcell("UserName"), 2),
				inputs.getcellvalue(inputs.Getcell("Password"), 2));
		Login.ClickLogin();
		Assert.assertEquals(Login.InvalidUser.getText(), "Username and/or password is incorrect. For help, contact your administrator.");
		System.out.println("Test case is failed with username" + inputs.getcellvalue(inputs.Getcell("UserName"), 2));
	}

}
