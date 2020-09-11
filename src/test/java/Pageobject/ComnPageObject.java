package Pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.TestBase;
import Pageobject.ComnPageObject;

public class ComnPageObject extends TestBase{
	private static final Logger logger = LogManager.getLogger(ComnPageObject.class);
	WebDriver driver;
	private By Search_Text_Box = By.id("twotabsearchtextbox");
	private By Search_Btn= By.xpath("//input[@value='Go']");
	final By nav_link_logo =  By.xpath("//a[@class='nav-logo-link']");
	
	
	
	public ComnPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public void Search_Text_Box(String text) {
		driver.findElement(Search_Text_Box).sendKeys(text);
		logger.info("value enter in Text box" + text);
	}
	public void Search_Btn() {
		driver.findElement(Search_Btn).click();
	}
	public void Get_Title() {
		
		String Actual = driver.getTitle();
		Assert.assertEquals(ExpectedTitle, Actual);
	}


}

