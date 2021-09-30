package org.dropdown;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdown extends BaseClassSelTasks{
	
	public MultiDropdown() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="fruits")
	private WebElement drpdownFruits;

	public WebElement getDrpdownFruits() {
		return drpdownFruits;
	}
	
	public void selectMultiple(int index1, int index2) throws InterruptedException {
		
		Select s = new Select(getDrpdownFruits());
		
		s.selectByIndex(index1);
		s.selectByIndex(index2);
		
		Thread.sleep(1000);
		s.deselectByIndex(index2);
		s.deselectAll();
		

	}

}
