package Capstone_project.Sauce_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders_complete {
	
Actions actions;
	
	@FindBy(xpath= "//*[@id=\"checkout_complete_container\"]/h2")
	private WebElement order_complete_msg;
	
	
	public Orders_complete(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		
	}
	
	public String check_order_sucess() throws InterruptedException {
		Thread.sleep(2000);
		String actual_msg = order_complete_msg.getText();
		return actual_msg;
	}

}
