package org.parameters;

import org.baseclass.BaseClassSelTasks;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest extends BaseClassSelTasks{
	
	@Parameters({"username", "password"})
	@Test
	private void testFBParameters(@Optional("manoj") String username, @Optional("5678") String password) {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		launchURL("https://en-gb.facebook.com/");
		
		FacebookLogin fb = new FacebookLogin();
		fb.getTxtboxUsername().sendKeys(username);
		fb.getTxtboxPassword().sendKeys(password);
	}

}
