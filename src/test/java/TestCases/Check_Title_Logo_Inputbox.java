package TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.TestBase;
import Pageobject.ComnPageObject;
import Pageobject.Login_Page_Object;

public class Check_Title_Logo_Inputbox extends TestBase
{
	WebDriver driver;
	 @Before
	     
	    public void set_up() {
		 driver= new ChromeDriver();
		 driver.get(Base_Url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }
	
	@ Test
	 
	public void validateLogo() {
		
		final By nav_link_logo =  By.xpath("//a[@class='nav-logo-link']");
		boolean b = driver.findElement(nav_link_logo).isDisplayed();
		Assert.assertEquals("Navigation link logo",true, b);
		ComnPageObject ComnPageObject = new ComnPageObject(driver);
		Login_Page_Object Login_Object = new Login_Page_Object(driver);
		
		// Call methods
		ComnPageObject.Search_Text_Box("earphones");
		Login_Object.Pass_mail("yuvrajghayal@gmail.com");
		Login_Object.Pass_Password("Yuvraj@1");
	}
	

}
   
	
	
