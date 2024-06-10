package pack1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenshot
{
	
	public  static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//ELCOT//eclipse-workspace//testing//drivers//chromedriver.exe");
		ChromeDriver driv=new ChromeDriver();
		//driv.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driv.get("https://www.orangehrm.com/");
	driv.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("abc@gmail.com");
	driv.findElement(By.id("Form_submitForm_action_request")).click();
	String exptitle=driv.getTitle();
	String acttitle="30-Day Advanced Free Trial | OrangeHRM";
	if(acttitle.equals(exptitle))
	{
		System.out.println("True");
	}
	WebElement a=driv.findElement(By.xpath("(//div[@class='col-md-5 col-sm-12']//div)[1]"));
File src1=a.getScreenshotAs(OutputType.FILE);	
	File dest=new File("C://Users//ELCOT//eclipse-workspace//testing//screenshot/sc3.png");
	try {
		FileHandler.copy(src1, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driv.navigate().back();
	driv.close();
	
	
	}

}
