package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class OrangeHRMLogin extends ProjectMethods {
	public OrangeHRMLogin() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="txtUsername")
	public WebElement username;
	
	public OrangeHRMLogin enterUserName(String data)
	{
		type(username, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="txtPassword")
	public WebElement password;
	
	public OrangeHRMLogin enterPassword(String data)
	{
		type(password, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="btnLogin")
	public WebElement loginButton;
	
	public HomePage login()
	{
		button(loginButton);
		return new HomePage();
	}
	
	
}
