package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//ELCOT//eclipse-workspace//testing//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		WebElement table=driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-header-box']//thead[1]"));
		//System.out.println(table.getText());
		List<WebElement> head=table.findElements(By.tagName("th"));
		WebElement hrows=driver.findElement(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']"));
		//System.out.println(hrows.getText());
		List<WebElement> rows=hrows.findElements(By.tagName("tr"));
		int size=rows.size();
		//System.out.println(size);
		for(WebElement i:rows)
		{
			List<WebElement> columns=i.findElements(By.tagName("td"));
			WebElement lastcol=columns.get(1);
			System.out.println(lastcol.getText());
		}
		

	}

}
