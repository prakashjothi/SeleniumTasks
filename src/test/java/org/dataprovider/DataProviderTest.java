package org.dataprovider;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DataProviderTest extends BaseClassSelTasks {

	
	@Test(dataProvider = "login", dataProviderClass = Data.class)
	private void FBDataProvider(String user, String pass) throws InterruptedException {
		
		FacebookLoginDP fb = new FacebookLoginDP();
		launchBrowser("chrome");
		launchURL("https://en-gb.facebook.com/");

		fb.login(user, pass);
			
	}

}
