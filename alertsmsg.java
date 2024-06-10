package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsmsg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//ELCOT//eclipse-workspace//test//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("karti@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]")).click();
		driver.manage().window().maximize();
		driver.quit();

	//driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0k1qf0zhv0o5t1ef5bzcawr7iz675404");
		/*driver.findElement(By.id("j_idt88:j_idt91")).click();
		Alert ac=driver.switchTo().alert();
		System.out.println(ac.getText());
		ac.accept();
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		Alert ac1=driver.switchTo().alert();
		System.out.println(ac1.getText());
		ac1.dismiss();
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Alert ac2=driver.switchTo().alert();
		System.out.println(ac1.getText());
		ac2.sendKeys("vanakkam");
		ac2.accept();*/


	}

}
