package org.screenshot;

import java.io.IOException;

import org.baseclass.BaseClassSelTasks;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ScreenshotTest extends BaseClassSelTasks {
	
	@Test
	private void greenScreenshot() throws IOException {
		
		launchBrowser("chrome");
		launchURL("http://www.greenstechnologys.com/");
		
		screenShot();
	}
	
	@Test
	private void toolsScroll() {

		launchBrowser("chrome");
		launchURL("http://toolsqa.com/");
		
		ToolsQA tq = new ToolsQA();
		
		scrollDown(tq.getLinkRecent());

	}

}
