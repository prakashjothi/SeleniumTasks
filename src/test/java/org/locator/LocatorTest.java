package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorTest {
	
	@Test
	private void launchTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jprne\\eclipse-workspace\\prakash\\SeleniumTasks\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("prakash");
		driver.findElement(By.id("pass")).sendKeys("1234",Keys.ENTER);
		
		
				
	}

}
