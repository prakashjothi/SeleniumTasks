package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

public class BaseClassSelTasks {
	
	public static WebDriver driver;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	
	public void launchBrowser(String browserName) {

		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jprne\\eclipse-workspace\\prakash\\SeleniumTasks\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		default:
			break;
		}
		

	}
	
	public void launchURL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public void screenShot() throws IOException {

		ts = (TakesScreenshot)driver;
		long time = System.currentTimeMillis();
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\jprne\\eclipse-workspace\\prakash\\SeleniumTasks\\Screenshots\\"+time+".png");
		FileUtils.copyFile(src, des);
		

	}
	
	public void scrollDown(WebElement webElement) {

		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",webElement);

	}
	

}
