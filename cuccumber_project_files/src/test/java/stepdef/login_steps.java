package stepdef;

import com.pages.Homepage;
import com.pages.constants;
import com.pages.logOut;
import com.pages.login_page;

import common_methods.common_Methods;
import common_methods.validations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps {
	
	@Given("I am at the audio digest Home Page and validate")
	public void i_am_at_the_audio_digest_home_page_and_validate() throws Exception {
		validations.IsTrue(common_Methods.CurrentUrl(), constants.HomePageUrl, "home page url is not displayed");
	}

	@Given("I click on the profile Login and validate")
	public void i_click_on_the_profile_login_and_validate() throws Exception {
		Homepage.profile_login();
		validations.IsTrue(common_Methods.CurrentUrl(), constants.LoginPageUrl, "login page url is not displayed");
	}

	@When("I fill the account username textbox with {string}")
	public void i_fill_the_account_username_textbox_with(String string) throws Exception {
		login_page.enterEmailId(string);
	}

	@When("I fill the password textbox with {string}")
	public void i_fill_the_password_textbox_with(String string) throws Exception {
		login_page.enterPassword(string);
	}

	@When("I click the Login button")
	public void i_click_the_login_button() throws Exception {
		login_page.ClickOnLoginBtn();
	}

	@When("I should be appear dashboard page")
	public void i_should_be_appear_dashboard_page() throws Exception {
		validations.IsTrue(common_Methods.CurrentUrl(), constants.DashBoardPageUrl, "home page url is not displayed");
	}

	@Then("I logout")
	public void i_logout() throws Exception {
	    logOut.clickProfiledrpDown();
	    logOut.profileDrpDwnListDisplayed();
	    logOut.LogoutBtn();
	}

	
	


}
