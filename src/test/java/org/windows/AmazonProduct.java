package org.windows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProduct extends BaseClassSelTasks{
	
	public AmazonProduct() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='New Apple iPhone 11 (64GB) - Purple'])[1]")
	private WebElement firstProduct;

	public WebElement getFirstProduct() {
		return firstProduct;
	}
	
	public void openInNewWindow() throws AWTException {
		
		Actions a = new Actions(driver);
		Robot r = new Robot();
		a.contextClick(getFirstProduct()).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public void switchtoNewWindow() throws InterruptedException {
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		
		li.addAll(windowHandles);
		
		Thread.sleep(2000);
		driver.switchTo().window(li.get(1));
		
		Thread.sleep(3000);
		driver.close();
	}
	
	

}
