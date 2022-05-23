package org.Pages;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
public void loginpage() {
	PageFactory.initElements(driver,this);
}
	@FindBy(id="txtUsername")
	private WebElement txtusername;
	
	@FindBy(id="txtPassword")
	private WebElement txtpassword;
	
	@FindBy(id="btnLogin")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
}
