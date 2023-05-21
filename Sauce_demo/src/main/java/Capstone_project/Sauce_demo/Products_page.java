package Capstone_project.Sauce_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products_page {
	
	
	Actions actions;
	
	@FindBy(xpath= "//*[@id=\"item_4_title_link\"]")
	private WebElement product;
	
	@FindBy(xpath= "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	private WebElement Addtocart;
	
	
	public Products_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		
	}
	
	public void perform_add() throws InterruptedException {
		Thread.sleep(5000);
		product.click();
		Thread.sleep(2000);
		Addtocart.click();
	}
}
