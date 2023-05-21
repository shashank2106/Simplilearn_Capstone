package Capstone_project.Sauce_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
	
	Actions actions;
	
	@FindBy(xpath= "//*[@id=\"shopping_cart_container\"]/a")
	private WebElement cart;
	
	@FindBy(xpath= "//*[@id=\"checkout\"]")
	private WebElement checkout;
	
	
	public Cart_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		
	}
	
	public void view_checkout_cart() throws InterruptedException {
		Thread.sleep(2000);
		cart.click();
		Thread.sleep(2000);
		checkout.click();
	}
}
