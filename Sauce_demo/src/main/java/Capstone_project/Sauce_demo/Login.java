package Capstone_project.Sauce_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	Actions actions;
	
	@FindBy(xpath= "//*[@id=\"user-name\"]")
	private WebElement user_name;
	
	@FindBy(xpath= "//*[@id=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath= "//*[@id=\"login-button\"]")
	private WebElement login_btn;
	
	
	public 	Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		
	}
	
	public void perform_login() throws InterruptedException {
		Thread.sleep(2000);
		user_name.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
	}

}
