package stepDefination;

import io.cucumber.java.en.When;
import page.checkoutPage;



public class checkoutPageStep{
	
	checkoutPage page = new checkoutPage();
	
	@When("Click the checkout button")
	public void click_the_checkout_button() {
page.click_the_checkout_button();
	}
	
	@When("Enter the Firstname")
	public void enter_the_firstname() {
page.enter_the_firstname();
	}
	@When("Enter the Lastname")
	public void enter_the_lastname() {
page.enter_the_lastname();
	}
	@When("Enter the Zipcode")
	public void enter_the_zipcode() {

	}
	@When("Click the continue button")
	public void click_the_continue_button() {
page.click_the_continue_button();
	}
	@When("Validate the Finsh Button")
	public void validate_the_finsh_button() {

	}
	
	@When("click the Finish button")
	public void click_the_finish_button() {

	}
	@When("Validate the order confirmation")
	public void validate_the_order_confirmation() {
		
	}
	@When("validate the error message")
	public void validate_the_error_message() {

	}
}