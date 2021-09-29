package org.screenshot;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsQA extends BaseClassSelTasks {

	public ToolsQA() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[text()=normalize-space('Recent Tutorials')]")
	private WebElement linkRecent;

	public WebElement getLinkRecent() {
		return linkRecent;
	}
	
	
}
