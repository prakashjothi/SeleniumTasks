package org.robotclass;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.glass.events.KeyEvent;

public class RobotGreens {
	
	public RobotGreens(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[normalize-space(text())='Interview Questions']")
	private WebElement btnInterview;
	
	@FindBy(xpath="//a[normalize-space(text())='CTS Interview Question']")
	private WebElement btnCTS;

	public WebElement getBtnInterview() {
		return btnInterview;
	}

	public WebElement getBtnCTS() {
		return btnCTS;
	}
	
	public void rightClick(WebDriver driver) throws AWTException {
		
		Actions a = new Actions(driver);
		Robot r = new Robot();
		getBtnInterview().click();
		a.contextClick(getBtnCTS()).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
