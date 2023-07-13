package stepdef;

import com.pages.Playlist_page;
import com.pages.constants;
import com.pages.dashboardPage;
import com.pages.myworkprofilePage;

import common_methods.common_Methods;
import common_methods.validations;
import io.cucumber.java.en.Given;

public class My_workprofile_steps {
	
	@Given("I click on the profile dropdown to navigate workprofile")
	public void i_click_on_the_profile_dropdown_to_navigate_workprofile() throws Exception {
		dashboardPage.navigate_myworkprofile();
		validations.IsTrue(common_Methods.CurrentUrl(),constants.myworkprofile_url,"my workprofile page url is not displayed");
	}

	@Given("I add state to verify feilds")
	public void i_add_state_to_verify_feilds() throws Exception {
		myworkprofilePage.state_Licensure_drpdwn();
		myworkprofilePage.State_select();
		myworkprofilePage.Licensure_addBtn();
	}

	@Given("I add state without selecting any state and validate")
	public void i_add_state_without_selecting_any_state_and_validate() throws Exception {
		myworkprofilePage.Licensure_addBtn();
		validations.IsDsiplayed(myworkprofilePage.State_error_msg(), "required state to proceed error message is not displayed");
	}


}
