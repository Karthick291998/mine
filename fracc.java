package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class fracc {
@Test(groups= {"mac"})
//(dependsOnMethods="selenurmlearn.facebook.fb")
	public  void fra() {
		System.setProperty("webdriver.chrome.driver","C://Users//ELCOT//eclipse-workspace//testing//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		/*driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node01jh32bf2verbgeizgtuil3oqp539057.node0");
		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		WebElement button=driver.findElement(By.xpath("//button[text()='Click Me']"));
		button.click();  --frame handling--
		String name=button.getText();
		System.out.println(name);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement button1=driver.findElement(By.xpath("//button[text()='Count Frames']"));
		button1.click();
		String name1=button1.getText();
		System.out.println(name1);*/
		/*driver.get("https://www.leafground.com/drag.xhtml");
		WebElement source=driver.findElement(By.id("form:drag_content"));
		WebElement target=driver.findElement(By.id("form:drop"));
		Actions builder=new Actions(driver);  --drag and drop--
		builder.dragAndDrop(source, target).perform();*/
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement source=driver.findElement(By.id("form:conpnl"));
		Point pt=source.getLocation();
		int X=pt.getX();
		int Y=pt.getY();
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(source,X+50,Y+50).perform();

	}

}
