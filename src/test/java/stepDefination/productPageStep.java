package stepDefination;

import io.cucumber.java.en.When;
import page.productPage;

public class productPageStep {
	productPage page = new productPage();
	@When("Click  the bagpack picture")
	public void click_the_bagpack_picture() {
page.click_the_bagpack_picture();
	}
	@When("click the addtocart button")
	public void click_the_addtocart_button() {
page.click_the_addtocart_button();
	}
	@When("click the remove button")
	public void click_the_remove_button() {
page.click_the_remove_button();
	}
	@When("Click the Basket icon")
	public void click_the_basket_icon() {
page.click_the_basket_icon();
	}
}