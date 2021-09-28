package org.robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class RobotTest {

	
	@Test(enabled=false)
	private void robotFacebook() throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jprne\\eclipse-workspace\\prakash\\SeleniumTasks\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FacebookRobot fr = new FacebookRobot(driver);
		Actions a = new Actions(driver);
		fr.getTxtUsername().sendKeys("prakashjothi22@gmail.com");
		
		fr.cutUsername();
		
		a.moveToElement(fr.getTxtPassword()).click().perform();
		
		fr.pasteInPassword();
	
		
		
	}
	
	@Test(enabled=true)
	private void robotGreens() throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jprne\\eclipse-workspace\\prakash\\SeleniumTasks\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		RobotGreens rg = new RobotGreens(driver);
		
		rg.rightClick(driver);
	}
	
	
	
}
