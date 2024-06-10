package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class navigate {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//ELCOT//eclipse-workspace//testing//drivers//chromedriver.exe");
		ChromeDriver dc=new ChromeDriver();
		dc.get("https://www.opencart.com/");
/*dc.findElement(By.xpath("//img[contains(@class,'_s0 _4ooo')]")).click();
dc.findElement(By.id("email")).sendKeys("8695352365");
dc.findElement(By.id("pass")).sendKeys("Karthick");
dc.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
dc.findElement(By.xpath("(//ul[@class='nav navbar-nav']//a)[1]")).click();
dc.navigate().back();
dc.navigate().refresh();
dc.navigate().forward();*/
Point pt=dc.findElement(By.xpath("(//a[contains(@class,'btn btn-white')])[1]")).getLocation();
int x=pt.getX();
int y=pt.getY();
System.out.println("x is " + x);
System.out.println("y is " + y);
//String col=dc.findElement(By.xpath("(//a[contains(@class,'btn btn-success')])[1]")).getCssValue("background-color");
//System.out.println(col);
WebElement a=dc.findElement(By.xpath("(//a[contains(@class,'btn btn-success')])[1]"));
Rectangle rect=a.getRect();
System.out.println(rect.getHeight());
System.out.println(rect.getWidth());



	}

}
