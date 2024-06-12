package testng;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonwatch extends dataprovider {
	public static RemoteWebDriver driver;
	@BeforeMethod
	public void beforetest()
	{
		System.out.println("Before method");
		Assert.assertEquals(true, true);
	}
	@AfterMethod
	public void aftertest()
	{
		System.out.println("After method");
	}
	@Test(priority=1)
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		opt.addArguments("disable-popups");
		opt.addArguments("start-maximized");
		driver=new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
	}
	@Test(priority=2)
	public void select() throws IOException, Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement all=driver.findElement(By.xpath("//div[@id='nav-search-dropdown-card']"));
		WebElement sel=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		boolean say=all.isDisplayed();
		if(say==true)
		{
		all.click();
		Thread.sleep(2000);
		File src=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\ELCOT\\eclipse-workspace\\pro\\screenshots\\src.png");
		FileHandler.copy(src, des);
		System.out.println(say);
			Select sc=new Select(sel);
			List<WebElement> options=sc.getOptions();
			for(WebElement ele:options)
			{
				String exp="Electronics";
				String act=ele.getText();
				if(act.equals(exp))
				{
					ele.click();
				}
			}
		}
	}
	@Test(priority=3,dataProvider="Sample")
	public void product(String prod) throws IOException, AWTException
	{
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(search).click().sendKeys(prod).build().perform();
		ac.sendKeys(Keys.ENTER);
		SoftAssert as=new SoftAssert();
		as.assertEquals("watch", prod, "assert");
	}
	@Test(priority=4)
	public void close()
	{
		driver.close();
	}
}
