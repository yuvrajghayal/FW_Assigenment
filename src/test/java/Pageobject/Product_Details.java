package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;

public class Product_Details {
	private WebDriver driver;
	
	private By Product_Name = By.id("productTitle");
	private By Add_to_Cart = By.id("submit.add-to-cart");
	private By Buy_Now = By.id("buy-now-button");
	
public Product_Details(WebDriver driver) {
	this.driver = driver;
}
public void Check_Product_Name() {
	boolean b = driver.findElement(Product_Name).isDisplayed();
	Assert.assertEquals("Product_Name",true, b);
}
public void Add_To_Cart() {
	boolean b = driver.findElement(Add_to_Cart).isDisplayed();
	Assert.assertEquals("Add_to_Cart", true, b);
}
public void Buy_Now() {
	boolean b = driver.findElement(Buy_Now).isDisplayed();
	Assert.assertEquals("Buy_Now", true, b);
	
}
}
