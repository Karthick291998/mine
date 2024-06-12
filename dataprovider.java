package testng;

import org.testng.annotations.DataProvider;

public class dataprovider {
		@DataProvider(name="Sample")
	public Object[][] data()
	{
		return new Object[][] {{"Watch"}};
	}

}
