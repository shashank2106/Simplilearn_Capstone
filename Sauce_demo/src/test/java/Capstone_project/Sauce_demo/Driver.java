package Capstone_project.Sauce_demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver extends Tools {
	
	protected static Login login;
	protected static Products_page product;
	protected static Cart_page cart;
	protected static Check_out_page checkout;
	protected static Orders_complete orders;
	
	
	
	public static void init() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://saucedemo.com");
		
		login = new Login(driver);
		product = new Products_page(driver);
		cart = new Cart_page(driver);
		checkout = new Check_out_page(driver);
		orders = new Orders_complete(driver);
	
	}
}
