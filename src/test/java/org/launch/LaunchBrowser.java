package org.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	private void launchTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jprne\\eclipse-workspace\\prakash\\SeleniumTasks\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

	}
	

}
