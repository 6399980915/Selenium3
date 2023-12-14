package stepDefination;

import io.cucumber.java.en.When;
import page.navbarPage;

public class navbarPageStep {
	navbarPage click = new navbarPage();
	@When("click the all item")
	public void click_the_all_item() {
click.click_the_all_item();
	}
	@When("click the about")
	public void click_the_about() {
click.click_the_about();
	}
	@When("validation for about page")
	public void validation_for_about_page() {

	}

@When("click the logout")
public void click_the_logout() {
    
}
@When("click the reset app state")
public void click_the_reset_app_state() {

}
}