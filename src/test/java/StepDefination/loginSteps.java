package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
	}

	@When("enters correct username and password")
	public void enters_correct_username_and_password() {
		System.out.println("Enter correct usernamer and pass");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Click on login button");
	}

	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		System.out.println("Lands on homepage");
	}
}
