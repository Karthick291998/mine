package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hechtic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//ELCOT//eclipse-workspace//test//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement button=driver.findElement(By.xpath("//button[@id='submit']"));
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", user);
		js.executeScript("arguments[0].setAttribute('value','karti')",user);
		js.executeScript("arguments[0].setAttribute('style','background:red')", user);
	Object obj=js.executeScript("return arguments[0].getAttribute('value')", user);
	System.out.println(obj);
	js.executeScript("arguments[1].setAttribute('value','11233')",user,pass);
	Object obj2=js.executeScript("return arguments[1].getAttribute('value')", user,pass);
	System.out.println(obj2);
	js.executeScript("arguments[0].click",button);
	System.out.println(button.getText());
	WebElement title=driver.findElement(By.xpath("//h2[text()='Test login']"));
	js.executeScript("arguments[0].scrollIntoView(false)",title);
	
	}

}
