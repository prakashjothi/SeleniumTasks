package org.assertt;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest extends BaseClassSelTasks {
	
	@Test(enabled=false)
	private void A() {
		
		launchBrowser("chrome");
		launchURL("https://en-gb.facebook.com/");
		
		String url = driver.getCurrentUrl();
		boolean ct = url.contains("facebook");
		Assert.assertTrue(ct, "Verify url");
		
	}
	
	@Test(enabled=false)
	private void B() throws InterruptedException {
		
		FacebookLogin fb = new FacebookLogin();
		WebElement txtboxUsername = fb.getTxtboxUsername();
		txtboxUsername.sendKeys("prakash");
		Thread.sleep(2000);
		Assert.assertEquals(txtboxUsername.getAttribute("value"), "manoj");
		

	}
	
	@Test(enabled=true)
	private void softAssertTest() throws InterruptedException {
		launchBrowser("chrome");
		launchURL("https://en-gb.facebook.com/");
		
		SoftAssert s = new SoftAssert();
		FacebookLogin fb = new FacebookLogin();
		WebElement txtboxUsername = fb.getTxtboxUsername();
		txtboxUsername.sendKeys("prakash");
		Thread.sleep(2000);
		s.assertEquals(txtboxUsername.getAttribute("value"), "manoj", "Verify username");
		
		WebElement txtboxPassword = fb.getTxtboxPassword();
		txtboxPassword.sendKeys("1234");
		Thread.sleep(2000);
		s.assertEquals(txtboxPassword.getAttribute("value"), "5678", "Verify password");
		
		fb.getBtnLogin().click();
		Thread.sleep(2000);
		s.assertTrue(driver.getCurrentUrl().contains("proxy"), "Verify url after login");
		
		s.assertAll();
		System.out.println("This will not print");

	}

}
