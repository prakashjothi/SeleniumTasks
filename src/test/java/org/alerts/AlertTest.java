package org.alerts;

import org.baseclass.BaseClassSelTasks;
import org.testng.annotations.Test;

public class AlertTest extends BaseClassSelTasks{
	
	@Test
	private void demoAlert() {
		
		launchBrowser("chrome");
		launchURL("http://demo.automationtesting.in/Alerts.html");
		
		AlertDemo ad = new AlertDemo();
		ad.dealAlerts();

	}

}
