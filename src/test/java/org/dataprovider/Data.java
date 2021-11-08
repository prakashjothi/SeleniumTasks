package org.dataprovider;

import org.testng.annotations.DataProvider;

public class Data {

	@DataProvider(name = "login")
	private Object[] getData() {
		Object[][] obj = new Object[][] { { "manoj", "1234" }};
		return obj;
	}

}
