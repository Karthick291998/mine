package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginfun extends logindataprovider {
@Test(dataProvider="logindata")
	public  void login(String[] data) {
		System.setProperty("webdriver.chrome.driver", "C://Users//ELCOT//eclipse-workspace//test//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.findElement(By.id("email")).sendKeys(data[0]);
				driver.findElement(By.id("pass")).sendKeys(data[1]);
				driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]")).click();

	}

}
