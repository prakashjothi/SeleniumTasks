package org.dropdown;

import java.util.List;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown extends BaseClassSelTasks {

	public FacebookDropDown() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Create New Account')]")
	private WebElement btnCreateAcct;

	@FindBy(id = "day")
	private WebElement drpDownDay;

	public WebElement getBtnCreateAcct() {
		return btnCreateAcct;
	}

	public WebElement getDrpDownDay() {
		return drpDownDay;
	}

	public void printDays() {

		getBtnCreateAcct().click();
		Select s = new Select(getDrpDownDay());
		List<WebElement> options = s.getOptions();

		for (WebElement eachOption : options) {

			System.out.println(eachOption.getText());
		}
		
		s.selectByIndex(3);
	
	}
}
