package org.windows;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome extends BaseClassSelTasks{
	
	public AmazonHome() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement txtboxSearch;

	public WebElement getTxtboxSearch() {
		return txtboxSearch;
	}
	
	

}
