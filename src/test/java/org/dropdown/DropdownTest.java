package org.dropdown;
import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest extends BaseClassSelTasks {

	@Test(enabled=false)
	private void facebookDropDown() {
		
		launchBrowser("chrome");
		launchURL("https://en-gb.facebook.com/");
		
		FacebookDropDown fb = new FacebookDropDown();
		fb.printDays();
	
	}
	
	@Test
	private void multidropdown() throws InterruptedException {
		
		launchBrowser("chrome");
		launchURL("https://output.jsbin.com/osebed/2");
		
		MultiDropdown md = new MultiDropdown();
		md.selectMultiple(0, 2);	
		

	}
}
