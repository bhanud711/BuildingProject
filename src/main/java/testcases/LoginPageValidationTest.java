package testcases;

import org.testng.annotations.Test;

import pages.OrangeHRMLogin;
import wdMethods.ProjectMethods;

public class LoginPageValidationTest extends ProjectMethods{
     @Test
	public void validScenario()
	{
		new OrangeHRMLogin()
		.enterUserName("Admin")
		.enterPassword("admin123")
		.login();
	}
}
