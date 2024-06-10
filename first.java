package pack1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//ELCOT//eclipse-workspace//test//drivers//chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("vanakkam");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
		
		Navigation nav=driver.navigate();
		nav.back();
		nav.forward();
		nav.refresh();
		/*Actions ac=new Actions(driver);
		ac.moveToElement(email);
		ac.contextClick().build().perform();
		Robot rb=new Robot(); 
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("C://Users//ELCOT//eclipse-workspace//testing//screenshot//robot2.png");
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
	}

}
