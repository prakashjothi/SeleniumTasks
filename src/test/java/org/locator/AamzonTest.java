package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AamzonTest {
	
	@Test
	private void launchTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jprne\\eclipse-workspace\\prakash\\SeleniumTasks\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		
		
		AmazonHome ah = new AmazonHome(driver);
		ah.getTxtBoxSearch().sendKeys("iphone");
		ah.getTxtBtnSearch().click();
		
				
	}

}
