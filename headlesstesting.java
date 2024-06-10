package selenium.pract;
import org.openqa.selenium.chrome.ChromeDriver;

public class headlesstesting {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C://Users//ELCOT//eclipse-workspace//selenurmlearn//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String tit=driver.getTitle();
	System.out.println(tit);
	//driver.manage().window().minimize();
	//driver.close();
	}

}
