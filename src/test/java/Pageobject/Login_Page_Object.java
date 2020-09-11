package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.TestBase;

public class Login_Page_Object extends TestBase
{

	private WebDriver driver;
	private By email = By.id("ap_email");
	private By Conti_Btn = By.id("continue");
	private By Pass = By.id("ap_password");
	private By Login  = By.id("signInSubmit");
	
	public Login_Page_Object(WebDriver driver) {
		this.driver = driver;
	}
	public void Pass_mail(String Text) {
		driver.findElement(email).sendKeys(Text);
		driver.findElement(Conti_Btn).click();
	}
	public void Pass_Password(String Text) {
		driver.findElement(Pass).sendKeys(Text);
		driver.findElement(Login).click();
	}
}
