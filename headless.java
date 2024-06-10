package pack1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class headless {
	public static void main(String[] args)
	{
	//	System.setProperty("webdriver.firefox.marionette","C://Users//ELCOT//Downloads//Drivers//geckodriver.exe");
	//FirefoxDriver driver=new FirefoxDriver();
	//driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/");
	
	System.setProperty("webdriver.chrome.driver","C://Users//ELCOT//eclipse-workspace//testing//drivers//chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--headless=new");
	
	ChromeDriver driver2=new ChromeDriver(opt);
	driver2.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebooksignup%7C&placement=&creative=589460569891&keyword=facebooksignup&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327208335804%26loc_physical_ms%3D1007812%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=CjwKCAjwnv-vBhBdEiwABCYQA7Kkw9TXU8-KPcAhK7gnKatypW1rzKyMDnjYMjSwCh0cFcmOKLbnEhoCp24QAvD_BwE");
	driver2.manage().window().maximize();
	System.out.println(driver2.getTitle());
	
	
	}


}
