package org.windows;

import java.awt.AWTException;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class WindowTest extends BaseClassSelTasks {
	
	@Test
	private void amazonWindow() throws AWTException, InterruptedException {
		
		launchBrowser("chrome");
		launchURL("https://www.amazon.in/");
		
		AmazonHome ah = new AmazonHome();
		AmazonProduct ap = new AmazonProduct();
		
		ah.getTxtboxSearch().sendKeys("iPhone", Keys.ENTER);
		ap.openInNewWindow();
		
		ap.switchtoNewWindow();
		

	}

}
