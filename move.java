package pack1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class move {
@Test(invocationCount=2)
	public  void move() {
		System.setProperty("weddriver.chrome.driver","C://Users//ELCOT//eclipse-workspace//testing//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	/*	WebElement bt=driver.findElement(By.xpath("//i[contains(@class,'pi pi-table')]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(bt).click().perform();
		builder.doubleClick(driver.findElement(By.xpath("//li[@id='menuform:m_table']//i[1]"))).perform();*/
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.findElement(By.id("alert")).click();
	wait.until(ExpectedConditions.alertIsPresent());
		Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
		
	}

}
