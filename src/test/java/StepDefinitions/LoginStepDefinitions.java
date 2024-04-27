package StepDefinitions;

import com.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDefinitions {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("User is on Login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver();
	}

	@When("User enters uername as {string} and password as {string}")
	public void user_enters_uername_and_password(String userName, String password) {
		loginPage.enterUsername(userName);
		loginPage.enterPassword(password);
	}

	@And("Click on Login button")
	public void click_on_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {

		loginPage.checkHomePageLogo();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
	}
}