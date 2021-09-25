package org.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome {
	
	public AmazonHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement txtBoxSearch;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement txtBtnSearch;

	public WebElement getTxtBoxSearch() {
		return txtBoxSearch;
	}

	public WebElement getTxtBtnSearch() {
		return txtBtnSearch;
	}
	
	

}
