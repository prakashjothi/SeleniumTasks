package org.alerts;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertDemo extends BaseClassSelTasks{
	
	public AlertDemo() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='#OKTab']")
	private WebElement tabAlertbox;
	
	@FindBy(xpath="//div[@id='OKTab']/button")
	private WebElement btnAlertbox;
	
	@FindBy(xpath="//a[@href='#CancelTab']")
	private WebElement tabConfirm;

	@FindBy(xpath="//div[@id='CancelTab']/button")
	private WebElement btnConfirm;
	
	@FindBy(xpath="//a[@href='#Textbox']")
	private WebElement tabTextbox;
	
	@FindBy(xpath="//div[@id='Textbox']/button")
	private WebElement btnTextBox;

	public WebElement getTabAlertbox() {
		return tabAlertbox;
	}

	public WebElement getBtnAlertbox() {
		return btnAlertbox;
	}

	public WebElement getTabConfirm() {
		return tabConfirm;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getTabTextbox() {
		return tabTextbox;
	}

	public WebElement getBtnTextBox() {
		return btnTextBox;
	}
	
	public void dealAlerts() {
		
		getTabAlertbox().click();
		getBtnAlertbox().click();
		
		driver.switchTo().alert().accept();
		
		getTabConfirm().click();
		getBtnConfirm().click();
		
		driver.switchTo().alert().dismiss();
		
		getTabTextbox().click();
	
		getBtnTextBox().click();
		System.out.println(driver.switchTo().alert().getText());
				
		driver.switchTo().alert().accept();
		
		
		

	}
	
	

}
