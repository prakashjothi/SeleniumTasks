package org.webtable;

import java.util.List;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTableTest extends BaseClassSelTasks{
	
	@Test
	private void demoWebTable() {
		
		launchBrowser("chrome");
		launchURL("http://demo.guru99.com/test/write-xpath-table.html");
		
		WebElement table = driver.findElement(By.tagName("table"));
		System.out.println(table.getText());
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			System.out.println(row.getText());
		}
	}

}
