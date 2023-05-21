package Capstone_project.Sauce_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_out_page {
	
	
	boolean info_check;
	Actions actions;
	
	@FindBy(xpath= "//*[@id=\"first-name\"]")
	private WebElement first_name;
	
	@FindBy(xpath= "//*[@id=\"last-name\"]")
	private WebElement last_name;
	
	@FindBy(xpath= "//*[@id=\"postal-code\"]")
	private WebElement Zip_code;
	
	
	@FindBy(xpath= "//*[@id=\"continue\"]")
	private WebElement Continue_next;
	
	@FindBy(xpath= "//*[@id=\"finish\"]")
	private WebElement finish;
	
	
	public Check_out_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		
	}
	
	public void preform_checkout() throws InterruptedException {
		Thread.sleep(2000);
		first_name.sendKeys("Virat");
		last_name.sendKeys("Kohli");
		Zip_code.sendKeys("760018");
		Continue_next.click();
	}
	
	public void check_product_click_finish() throws InterruptedException {
		Thread.sleep(2000);
		finish.click();
	}

}
