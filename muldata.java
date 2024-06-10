package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class muldata extends dataprovider {
@Test(dataProvider="login")
	public  void mul(String Email,String pass) {
		System.setProperty("webdriver.chrome.driver", "C://Users//ELCOT//eclipse-workspace//test//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]")).click();
		System.out.println(Email + pass);
		driver.close();


	}

}
