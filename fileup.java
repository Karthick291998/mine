package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileup {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Users//ELCOT//eclipse-workspace//test//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://tiiny.host/?content=resume");
		driver.findElement(By.xpath("//button[@id='content-selector-tab-pdf']")).click();
		WebElement ele=driver.findElement(By.xpath("(//button[text()='Upload file'])[3]"));
		
		System.out.println(ele.getText());
		driver.manage().window().maximize();
		ele.click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\ELCOT\\Documents\\filetest.exe");
	}

}
