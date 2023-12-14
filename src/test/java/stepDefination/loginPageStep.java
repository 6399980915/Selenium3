package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.siginPage;

public class loginPageStep {
	siginPage login =  new siginPage();

	@When("user validate the username {string} and password {string}")
	public void user_validate_the_username_and_password(String x, String y) {
	login.user_validate_the_username_and_password(x, y);
	}

	@When("click the login button")
	public void click_the_login_button() {
    login.click_the_login_button();
	}

	@Then("Scusessfully login")
	public void scusessfully_login() {

	}
}
