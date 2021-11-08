package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunTest {
	
	@Test
	private void A1() {

		 System.out.println("Test A1");
		
	}

	@Test
	private void A2() {

		Assert.assertTrue(false);
		System.out.println("Test A2");
	}

	@Test
	private void A3() {

		System.out.println("Test A3");
	}

}
