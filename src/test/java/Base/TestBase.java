package Base;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase
{
	 
	 
	protected WebDriver driver; 
	protected String Base_Url = "https://amazon.in" ;
	protected String ExpectedTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	 private String SetBrowser() {
		 String DefaultBros = "Chrome";
		 String BrowserFromCmd = System.getProperty("Browser");
		 if(BrowserFromCmd==null) {
			 return DefaultBros;
		 }else {
			return BrowserFromCmd;
		 }
	 }
	 @Before
	 public void Set_up() {
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 }
	@After
	public void Clen_Up() {
		driver.quit();
	}

}
