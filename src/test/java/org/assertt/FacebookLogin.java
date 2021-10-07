package org.assertt;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin extends BaseClassSelTasks {
	
	public FacebookLogin() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtboxUsername;
	
	@FindBy(id="pass")
	private WebElement txtboxPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnLogin;

	public WebElement getTxtboxUsername() {
		return txtboxUsername;
	}

	public WebElement getTxtboxPassword() {
		return txtboxPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	

}
