package StepDefinitions;

import io.cucumber.java.en.*;

public class loginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside step - user is on login page");
	}

	@When("user enter username nad password")
	public void user_enter_username_nad_password() {
		System.out.println("Inside step - user enter username nad password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside step - clicks on login button");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		System.out.println("Inside step - user is navigated to the homepage");
	}
	
}
