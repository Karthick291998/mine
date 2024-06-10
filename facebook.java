package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook {
	@Test(groups={"vaa"})
public  void fb()
{
System.setProperty("weddriver.chrome.driver","C://Users//ELCOT//eclipse-workspace//testing//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/?stype=lo&deoia=1&jlou=AffEOAqf8PU4qmw1n7aTrs0nh5LQDFIYae_-bP0hwGlxUouRN6qlKT9ziRbLR5I1uVEUgz7I7RfGlMEpD6WqB-b0Ctpb8dyTgKTB27cwlezhrg&smuh=43327&lh=Ac_z5q659ICrM7EzuHI");

}
}
