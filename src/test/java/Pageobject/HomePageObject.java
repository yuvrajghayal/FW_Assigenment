package Pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;

import Base.TestBase;

public class HomePageObject extends TestBase {
	public static final Logger logger =(Logger) LogManager.getLogger(HomePageObject.class);
	private WebDriver driver;
    
	public void HomePageObject(WebDriver driver) {
		this.driver = driver;
		
	}
	
}
