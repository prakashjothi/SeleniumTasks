package org.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonActions {
	
	public AmazonActions(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Prime']")
	private WebElement linkPrime;
	
	@FindBy(id="multiasins-img-link")
	private WebElement linkJoin;

	public WebElement getLinkPrime() {
		return linkPrime;
	}

	public WebElement getLinkJoin() {
		return linkJoin;
	}
	
	
	
	
}
