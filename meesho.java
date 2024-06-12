package testng;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.olx.base;
import com.olx.browser;

public class meesho {
	base b1=new base();
	@Test(priority=1)
	public void launch()
	{
		b1.setup(browser.CHROME,"https://www.meesho.com/");
	}
	@Test(priority=2)
	public void searchProduct()
	{
		WebElement search=b1.element("xpath","//input[@placeholder='Try Saree, Kurti or Search by Product Code']");
		b1.type(search,"watch");
		search.sendKeys(Keys.ENTER);
	}
	@Test(priority=3)
	public void filter()
	{
		WebElement filter=b1.element("xpath","//div[@name='Men Analog Watches']");
		b1.click(filter);
	}
	@Test(priority=4)
	public void selectProduct()
	{
		WebElement selpro=b1.element("xpath","//p[text()='Fashionate Men Analog Watches']");
		b1.click(selpro);
	}

}
