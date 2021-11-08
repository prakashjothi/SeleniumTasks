package org.failedscreenshot;

import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenToAll.class)
public class FailedScreenshotTest extends BaseClassSelTasks{
	
	
	@BeforeMethod
	private void beforeMethod() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jprne\\eclipse-workspace\\prakash\\ReviewSelenium\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		

	}

	@Test(dataProvider="login")
	private void FBDataProvider(String user, String pass) {

		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		Assert.assertTrue(false);
		
	}

	
	@AfterMethod
	private void afterMethod() {
		// TODO Auto-generated method stub
		driver.quit();

	}

	@DataProvider(name="login", indices= {0})
	private Object[][] getData() {
		
		Object[][] obj = new Object[][] 
			{{"manoj", "1234"},
			{"prakash", "5678"}};
			
			return obj;
		}

}
