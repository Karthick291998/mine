package pack1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//ELCOT//eclipse-workspace//test//drivers//chromedriver.exe");
		ChromeDriver driv=new ChromeDriver();
		//driv.manage().timeoutsin/s?k=glasses&crid=3CNWD7LA2NWO1&sprefix=glasses%2Caps%2C1180&ref=nb_sb_ss_ts-doa-p_2_7");
	//driv.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[1]")).click();
	driv.findElements(By.xpath("//span[text()='Treo by Milton Vector Borosilicate Glass Tumbler, Set of 6, 300 ml, Transparent']"));
	String parent= driv.getWindowHandle();
	//System.out.println(driv.getTitle());
	//driv.findElement(By.id("j_idt88:j_idt91"));
	Set <String> win= driv.getWindowHandles();
	ArrayList<String> wind=new ArrayList<String>(win);
	for(String w:wind)
	{
		driv.switchTo().window(w);
		System.out.println(driv.getTitle());
	}
	
	}

}
