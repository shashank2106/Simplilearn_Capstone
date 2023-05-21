package Capstone_project.Sauce_demo;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Buy_product_steps_test extends Driver {
	
	@BeforeTest
	public void setup() {
		Driver.init();
	}
	
	@Test(priority=0)
	public void Login() throws InterruptedException {
		login.perform_login();
	}
	
	@Test(priority=1,dependsOnMethods="Login")
	public void View_product_and_add_to_cart() throws InterruptedException {
		product.perform_add();
	}
	
	@Test(priority=2,dependsOnMethods="View_product_and_add_to_cart")
	public void View_cart_checkout_cart() throws InterruptedException {
		cart.view_checkout_cart();
	}
	
	@Test(priority=3)
	public void Complete_checkout() throws InterruptedException {
		checkout.preform_checkout();
		checkout.check_product_click_finish();
	}
	
	@Test(priority=4)
	public void Order_success_validation() throws InterruptedException {
		String Expected_msg = "Thank you for your order!";
		String actual_msg = orders.check_order_sucess();
		Assert.assertEquals(Expected_msg,actual_msg);
	}
	
	
	@AfterTest
	public void Teardown() {
		driver.quit();
		
	}

}
